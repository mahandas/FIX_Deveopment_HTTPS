package client;

import com.google.gson.JsonObject;
import quickfix.Message;
import quickfix.field.CFICode;
import quickfix.field.Currency;
import quickfix.field.FutSettDate;
import quickfix.field.FutSettDate2;
import quickfix.field.NoRelatedSym;
import quickfix.field.OrderQty;
import quickfix.field.OrderQty2;
import quickfix.field.PartyID;
import quickfix.field.PartyIDSource;
import quickfix.field.PartyRole;
import quickfix.field.QuoteReqID;
import quickfix.field.Symbol;
import quickfix.fix43.QuoteRequest;
import quickfix.fix44.NewOrderSingle;
import util.DateUtil;

/**
 * @author mahan.das
 *
 */
public class RequestQuote {

	public static Message sendQuoteRequest(JsonObject crs) {
		
		QuoteRequest quoteRequest = new QuoteRequest();
		quoteRequest.set(new QuoteReqID(crs.get("Request_ID").getAsString()));		//Set QuoteReqID

		NewOrderSingle.NoPartyIDs grpPartyID = new NewOrderSingle.NoPartyIDs();
		grpPartyID.setField(new PartyID(ConfigReader.getConfigFile().getProperty("PartyID")));		
		grpPartyID.setField(new PartyIDSource('D'));	
		grpPartyID.setField(new PartyRole(13));				
		quoteRequest.addGroup(grpPartyID);

		quoteRequest.set(new NoRelatedSym(1));
		QuoteRequest.NoRelatedSym noRelatedSym = new QuoteRequest.NoRelatedSym();
		String CFICode=null,MaturityDate=null,FutSettDate=null,FutSettDate2=null;
		double OrderQty2 = 0;
		noRelatedSym.set(new Symbol(crs.get("FR_Deal_Pair").getAsString().replaceAll(" ", "").replaceAll("-","/"))); 

		if(crs.get("FR_Deal_Type").getAsString().equalsIgnoreCase("SPOT"))
			CFICode="SPOT" ; 
		else if(crs.get("FR_Deal_Type").getAsString().equalsIgnoreCase("OUTRIGHT"))
		{	
			CFICode="OUTRIGHT";
			
		}
		

		noRelatedSym.setField(new CFICode(CFICode));
		quoteRequest.addGroup(noRelatedSym);

		quoteRequest.setField(new OrderQty(crs.get("Quoted_Amt").getAsDouble()));
		
		if(CFICode.equalsIgnoreCase("FFCPNO")||CFICode.equalsIgnoreCase("FFCNNO"))
		{
			quoteRequest.setField(new FutSettDate(FutSettDate));;
			if(CFICode.equalsIgnoreCase("FFCNNO"))
			{
				quoteRequest.setString(7075, "RBIB-ABS VWAP");
			}

		}
		else if(CFICode.equalsIgnoreCase("FFCPNW")||CFICode.equalsIgnoreCase("FFCNNW"))
		{
			quoteRequest.setField(new FutSettDate(FutSettDate));
			quoteRequest.setField(new FutSettDate2(FutSettDate));
			quoteRequest.setField(new OrderQty2(crs.get("Order_Qty2").getAsDouble()));
		}
		quoteRequest.setField(new Currency(crs.get("Quoted_Ccy").getAsString()));
		if(ConfigReader.getConfigFile().getProperty("Streaming").equalsIgnoreCase("Y"))
			quoteRequest.setString(126,DateUtil.getCurrentDateTime_Str());

		return quoteRequest;
	}
}
