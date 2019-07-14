package client;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.FieldConvertError;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.Initiator;
import quickfix.LogFactory;
import quickfix.MessageStoreFactory;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;
import quickfix.SocketInitiator;
import quickfix.fix44.MessageFactory;
import quickfix.mina.acceptor.DynamicAcceptorSessionProvider;
import quickfix.mina.acceptor.DynamicAcceptorSessionProvider.TemplateMapping;


public class FXClient {

	private static SocketAcceptor acceptor=null;
	private static Initiator initiator=null;

	private static SessionID acceptorSession=null;
	private static SessionID initiatorSession=null;

	private static ApplicationImpl application=new ApplicationImpl();
	


	private final transient Map<InetSocketAddress, List<DynamicAcceptorSessionProvider.TemplateMapping>> dynSessionMap = new HashMap<InetSocketAddress,List<DynamicAcceptorSessionProvider.TemplateMapping>>();

	
	
	public static SessionID getAcceptorSession() {
		return acceptorSession;
	}

	public static SessionID getInitiatorSession() {
		return initiatorSession;
	}

	public static void main(String[] args) {


		FXClient obj=new FXClient();
		obj.initialiseParameter(args);
		obj.startServices();

	}

	private void initialiseParameter(String[] args) {
		try {
			ConfigReader.readConfigs(args[0]);
		} catch (Exception e) {
			
			try {
				// Display error message and wait for 15 seconds and exit
				Thread.sleep(15000);
			} catch (InterruptedException f) {
				f.getMessage();
			}
			System.exit(1); // Exit program if failed to load properties file
		}
			
	}

	/**
	 * 
	 */
	public void startServices() {
		// Create a JVMShutdownHook to trap jvm exit event
		
		final JVMShutdownHook jvmShutdownHook = new JVMShutdownHook();
		Runtime.getRuntime().addShutdownHook(jvmShutdownHook);
		
		
		SessionSettings settings1;
		SessionSettings settings2;
		try {

			MessageStoreFactory storeFactory;
			LogFactory logFactory;
			MessageFactory messageFactory = new MessageFactory();
			String beginString1="";
			String senderCompID1="";
			String targetCompID1="";
			String beginString2="";
			String senderCompID2="";
			String targetCompID2="";
			
			//For Initiator
			settings1 = new SessionSettings(ConfigReader.getConfigFile().getProperty("Initiator"));
			beginString1 = settings1.get().getString("BeginString");
			senderCompID1 = settings1.get().getString("SenderCompID");
			targetCompID1 = settings1.get().getString("TargetCompID");
			initiatorSession = new SessionID(beginString1, senderCompID1, targetCompID1);

			storeFactory = new FileStoreFactory(settings1);
			logFactory = new FileLogFactory(settings1);
			initiator = new SocketInitiator(application, storeFactory, settings1, logFactory, messageFactory);

			//For Acceptor
			settings2 = new SessionSettings(ConfigReader.getConfigFile().getProperty("Acceptor"));
			beginString2 = settings2.get().getString("BeginString");
			senderCompID2 = settings2.get().getString("SenderCompID");
			targetCompID2 = settings2.get().getString("TargetCompID");
			acceptorSession = new SessionID(beginString2, senderCompID2, targetCompID2);
			storeFactory = new FileStoreFactory(settings2);
			logFactory = new FileLogFactory(settings2);
			acceptor = new SocketAcceptor(application, storeFactory, settings2, logFactory, messageFactory);
			configureDynamicSessions(settings2, application, storeFactory, logFactory, messageFactory);

			acceptor.start();
			System.out.println("Starting Acceptor");

			initiator.start();
			System.out.println("Starting Initiator");
			
			Thread.sleep(1000);



		} catch (ConfigError e) {

			e.printStackTrace();
		} catch (FieldConvertError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void configureDynamicSessions(SessionSettings settings, Application application,
			MessageStoreFactory msgStoreFactory, LogFactory logFactory, MessageFactory msgFactory) throws ConfigError,
	FieldConvertError {
		Iterator<SessionID> sectionIterator = settings.sectionIterator();
		InetSocketAddress address;
		while (sectionIterator.hasNext()) {
			SessionID sessionID = (SessionID) sectionIterator.next();
			if (isSessionTemplate(settings, sessionID)) {
				address = getAcceptorSocketAddress(settings, sessionID);
				getMappings(address).add(new DynamicAcceptorSessionProvider.TemplateMapping(sessionID, sessionID));
			}

		}

		for (Iterator<Entry<InetSocketAddress, List<TemplateMapping>>> iterator = this.dynSessionMap.entrySet().iterator(); iterator
				.hasNext();) {
			Entry<InetSocketAddress, List<TemplateMapping>> entry = iterator.next();
			FXClient.acceptor.setSessionProvider((SocketAddress) entry.getKey(), new DynamicAcceptorSessionProvider(
					settings, (List<TemplateMapping>) entry.getValue(), application, msgStoreFactory, logFactory, msgFactory));
		}
	}

	private boolean isSessionTemplate(SessionSettings settings, SessionID sessionID) throws ConfigError,
	FieldConvertError {
		return (settings.isSetting(sessionID, "AcceptorTemplate")) && (settings.getBool(sessionID, "AcceptorTemplate"));
	}

	private InetSocketAddress getAcceptorSocketAddress(SessionSettings settings, SessionID sessionID)
			throws ConfigError, FieldConvertError {
		String acceptorHost = settings.getString(sessionID, "SocketAcceptAddress");

		int acceptorPort = (int) settings.getLong(sessionID, "SocketAcceptPort");

		InetSocketAddress address = new InetSocketAddress(acceptorHost, acceptorPort);

		return address;
	}

	private List<DynamicAcceptorSessionProvider.TemplateMapping> getMappings(InetSocketAddress address) {
		List<DynamicAcceptorSessionProvider.TemplateMapping> mappings = (List<DynamicAcceptorSessionProvider.TemplateMapping>) this.dynSessionMap.get(address);
		if (mappings == null) {
			mappings = new ArrayList<DynamicAcceptorSessionProvider.TemplateMapping>();
			this.dynSessionMap.put(address, mappings);
		}
		return mappings;
	}

	/**
	 * Traps a JVM shutdown event to send logout message
	 */
	class JVMShutdownHook extends Thread {
		public void run() {
			System.out.println("Exit process ... ");
			//			try {
			//				connection.close();
			//			} catch (JMSException e) {
			//				LOG.error("Error while closing AcitveMQ connection");
			//				e.printStackTrace();
			//			}
			initiator.stop();
		}
	}
}
