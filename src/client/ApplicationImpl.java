package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import client.FIX_MessageStructure.StructExecutionReport;
import client.FIX_MessageStructure.StructResponseMessage;
import quickfix.Application;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.RejectLogon;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.UnsupportedMessageType;
import quickfix.field.AvgPx;
import quickfix.field.CFICode;
import quickfix.field.ClOrdID;
import quickfix.field.CumQty;
import quickfix.field.Currency;
import quickfix.field.ExecID;
import quickfix.field.ExecType;
import quickfix.field.LastForwardPoints;
import quickfix.field.LastPx;
import quickfix.field.LastQty;
import quickfix.field.LastSpotRate;
import quickfix.field.MsgType;
import quickfix.field.OrdStatus;
import quickfix.field.OrdType;
import quickfix.field.OrderID;
import quickfix.field.OrderQty;
import quickfix.field.Password;
import quickfix.field.Price;
import quickfix.field.QuoteID;
import quickfix.field.QuoteReqID;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.Text;
import quickfix.field.TimeInForce;
import quickfix.field.Username;
import quickfix.field.ValidUntilTime;

import util.DateUtil;

/**
 * @author mahan.das
 *
 */
public class ApplicationImpl extends MessageCracker implements Application {
	Gson gson = new Gson();


	public ApplicationImpl() {

	}
	private boolean isMessageOfType(quickfix.Message message, String type) {
		try {
			return type.equals(message.getHeader().getField(new MsgType()).getValue());
		} catch (FieldNotFound e) {

			return false;
		}
	}
	@Override
	public void fromAdmin(Message message, SessionID arg1)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {

	}
	public String parseQuote(Message message) {

		StructResponseMessage quote=new StructResponseMessage();
		try {
			quote.setMSGTYPE("QUOTE");
			quote.setPP_CODE("Code");
			quote.setFPRD_RFQ_Request_ID(message.getField(new QuoteReqID()).getValue());	//Set Quote Request ID

			quote.setFPRD_Quote_ID(message.getField(new QuoteID()).getValue());		//Set the Quote ID
			quote.setFPRD_Deal_Pair(message.getField(new Symbol()).getValue());

			//Set the Valid Until Time in proper format
			quote.setFPRD_Valid_Until_Time(DateUtil.convertDateFormat(message.getField(new ValidUntilTime()).getValue().toString(),
					"EEE MMM dd HH:mm:ss z yyyy",
					DateUtil.DB_DATE_TIME_FORMAT));

			try {
				quote.setFPRD_Bid_Price(message.getString(132));		//Bid Px
			} catch (FieldNotFound fnf) {
				//				quote.setFPRD_Bid_Far_Price("0");

			}
			try {
				quote.setFPRD_Offer_Price(message.getString(133));	// Offer Px
			} catch (FieldNotFound fnf) {
				//				quote.setFPRD_Bid_Far_Price("0");
			}
			try {
				quote.setFPRD_Bid_Far_Price(message.getString(132));		//Bid Px
			} catch (FieldNotFound fnf) {
				//				quote.setFPRD_Bid_Far_Price("0");

			}
			try {
				quote.setFPRD_Offer_Far_Price(message.getString(133));	// Offer Px
			} catch (FieldNotFound fnf) {
				//				quote.setFPRD_Bid_Far_Price("0");
			}


			try {
				quote.setFPRD_Bid_Spot_Rate(message.getString(188));	//BidSpotRate
			} catch (FieldNotFound fnf) {
				//				quote.setFPRD_Bid_Spot_Rate("0");
			}
			try {
				quote.setFPRD_Offer_Spot_Rate(message.getString(190));	//OfferSpotRate
			} catch (FieldNotFound fnf) {

				//				quote.setFPRD_Offer_Spot_Rate("0");
			}
			try {
				quote.setFPRD_Bid_Forward_Points(message.getString(189));	//BidForwardPoints
			}catch (FieldNotFound fnf) {
				//				quote.setBidForwardPoints(0);

			}
			try {
				quote.setFPRD_Bid_Far_Forward_Points(message.getString(642));	//BidForwardPoints2
			}catch (FieldNotFound fnf) {
				//				quote.setBidForwardPoints2(0);

			}
			try {
				quote.setFPRD_Offer_Forward_Points(message.getString(191));	//OfferForwardPoints
			}catch (FieldNotFound fnf) {
				//				quote.setOfferForwardPoints(0);

			}
			try {
				quote.setFPRD_Offer_Far_Forward_Points(message.getString(643)); //OfferForwardPoints2
			}catch (FieldNotFound fnf) {
				//				quote.setOfferForwardPoints2(0);

			}
			
			try {
				quote.setFPRD_Bid_Swap_Points(message.getString(1065));	//BidSwapPoints
			}catch(FieldNotFound fnf)
			{
				//				quote.setBidSwapPoints(0);
			}
			try{
				quote.setFPRD_Offer_Swap_Points(message.getString(1066));	//OfferSwapPoints
			}catch(FieldNotFound fnf)
			{
				//				quote.setOfferSwapPoints(0);
			}

		}catch(Exception e) {

			e.printStackTrace();
		}
		return gson.toJson(quote).toString();
	}

	@Override
	public void fromApp(Message arg0, SessionID arg1)
			throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {

		if(arg1.toString().equalsIgnoreCase(FXClient.getInitiatorSession().toString()))
		{
			if(isMessageOfType(arg0,MsgType.QUOTE)) {
				try {

					sendPOST(parseQuote(arg0));

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			if(isMessageOfType(arg0,MsgType.EXECUTION_REPORT)) {
				try {

					sendPOST(parseExecReport(arg0));

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}


		if(arg1.toString().equalsIgnoreCase(FXClient.getAcceptorSession().toString()))
		{

			if(isMessageOfType(arg0,MsgType.QUOTE_REQUEST)) {

				JsonObject json = (JsonObject) new JsonParser().parse(arg0.getString(355));
				sendRequestForQuotation(json);

			}else if(isMessageOfType(arg0,MsgType.ORDER_SINGLE)) {

				JsonObject json = (JsonObject) new JsonParser().parse(arg0.getString(355));
				sendOrderRequest(json);
			}
		}
	}

	public void sendPOST(String response) throws IOException {

		
		URL url = new URL(ConfigReader.getConfigFile().getProperty("URL"));
		URLConnection con = url.openConnection();
		HttpURLConnection http = (HttpURLConnection)con;
		http.setRequestMethod("POST"); // PUT is another valid option
		http.setDoOutput(true);

		byte[] out =response .getBytes(StandardCharsets.UTF_8);
		int length = out.length;

		http.setFixedLengthStreamingMode(length);
		http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		http.connect();
		try(OutputStream os = http.getOutputStream()) {
			os.write(out);
		}

		int responseCode = http.getResponseCode();
		System.out.println("POST Response Code : " + responseCode);

		if (responseCode == HttpURLConnection.HTTP_OK) { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response1 = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response1.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response1.toString());
		} else {
			System.out.println("POST request not worked");
		}

	}

	public void sendRequestForQuotation(JsonObject crs) {

		SessionID sessionID = FXClient.getInitiatorSession();
		if (sessionID != null && Session.doesSessionExist(sessionID)) {

			try {
				Session.sendToTarget(RequestQuote.sendQuoteRequest(crs), sessionID) ;
			} catch (SessionNotFound e) {
				
				e.printStackTrace();
			} 
			System.out.println("Quote request sent successfully for ID :" + crs.get("Request_ID").getAsString() );

		} else {
			System.out.println("Session does not exist");
		}



	}
	public void sendOrderRequest(JsonObject crs) {


		SessionID sessionID = FXClient.getInitiatorSession();
		if (sessionID != null && Session.doesSessionExist(sessionID)) {

			try {
				Session.sendToTarget(OrderRequest.sendOrderRequest(crs), sessionID) ;
			} catch (SessionNotFound e) {
				
				e.printStackTrace();
			} 
			System.out.println("Quote request sent successfully for ID :" + crs.get("Request_ID").getAsString() );

		} else {
			System.out.println("Session does not exist");
		}

	}

	@Override
	public void onCreate(SessionID arg0) {
	
		System.out.println("Session created");
	}

	@Override
	public void onLogon(SessionID arg0) {
		
		System.out.println("Logged in with "+arg0.getTargetCompID());
		
	}

	@Override
	public void onLogout(SessionID arg0) {
		

	}

	@Override
	public void toAdmin(Message message, SessionID arg1) {
		if(isMessageOfType(message,MsgType.LOGON) && arg1.toString().equalsIgnoreCase(FXClient.getInitiatorSession().toString())) {
			System.out.println("Login session :"+arg1);
			 try {
	               
                 String password = "";
                 password = ConfigReader.getConfigFile().getProperty("Password").trim();
                 if (!password.isEmpty()) {
                     message.setField(new Password(password)); //Required
                 } else {
                     throw new Exception(" Password is not present in properties file!");
                 }
             
            
                 String userName = "";
                 userName = ConfigReader.getConfigFile().getProperty("Username").trim();
                 
                 if (!userName.isEmpty()) {
                     message.setField(new Username(userName)); //Required
                 } else {
                     throw new Exception(" Username is not present in properties file!");
                 }
             } catch (Exception e) {
//                 LOG.error("Error while setting Username and Password");
                 e.printStackTrace();
             }

		}

	}

	@Override
	public void toApp(Message arg0, SessionID arg1) throws DoNotSend {
	
	}
		
	private String parseExecReport(Message execRptMsg) {
		
	String execJSON = "";
	StructResponseMessage execRpt = new StructResponseMessage();
		try {
			execRpt.setMSGTYPE("EXECUTION_REPORT");
			execRpt.setPP_CODE("COde");
			execRpt.setFPRD_Quote_ID(execRptMsg.getField(new OrderID()).getValue());		//Set the Order Id in the Execution Report Structure
			execRpt.setFPRD_RFQ_ID (execRptMsg.getField(new ClOrdID()).getValue().substring(0, execRptMsg.getField(new ClOrdID()).getValue().length()-1));		//Set the Client Order ID
			execRpt.setFPRD_Trade_Order_Status(execRptMsg.getString(39)); // order status
			execRpt.setFPRD_External_Execution_ID(execRptMsg.getField(new ExecID()).getValue());
			execRpt.setFPRD_Trade_Exec_Type(execRptMsg.getString(150)); // Trade Exec type 


			try {
				execRpt.setFPRD_Deal_Pair(execRptMsg.getField(new Symbol()).getValue());	//Set the Currency Pair,e.g:EUR/USD
			} catch (FieldNotFound fnf) {
				execRpt.setFPRD_Deal_Pair("");
			}


			try {
				execRpt.setFPRD_Order_All_In_Rate(execRptMsg.getString(44)); // Price 
			} catch (FieldNotFound fnf) {
				//LOG.info(fnf.getMessage());
			}
			try {
				execRpt.setFPRD_Ccy1(execRptMsg.getField(new Currency()).getValue());
			} catch (FieldNotFound fnf) {
				//LOG.info(fnf.getMessage());
			}


			try {
				execRpt.setFPRD_Order_Fill_Amount (execRptMsg.getString(32)); // CumQTY
			}catch(FieldNotFound fnf)
			{
				execRpt.setFPRD_Order_Fill_Amount ("0");
			}
			

			try {
				execRpt.setFPRD_Order_Average_price(execRptMsg.getString(6)); //  Avg PX
			}catch(FieldNotFound fnf) {
				execRpt.setFPRD_Order_Average_price("0");
			}

			
			try {
				execRpt.setFPRD_Trade_Book_Status(execRptMsg.getField(new Text()).getValue());
			} catch (FieldNotFound fnf) {
				execRpt.setFPRD_Trade_Book_Status("");
			}
			//LOG.info("Execution Report received for Order ID:"+execRpt.getClOrdID());
			 execJSON=gson.toJson(execRpt);
			 return execJSON;
			


		} catch (Exception e) {
			//LOG.error("Error in parseExecReport for Order ID : " + execRpt.getClOrdID() + " : " + e.getMessage());
			e.printStackTrace();
			return execJSON;
		}
	

	}


}
