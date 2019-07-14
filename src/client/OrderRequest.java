package client;

import java.util.Date;
import com.google.gson.JsonObject;
import client.FIX_MessageStructure.StructNewOrderSingle;
import quickfix.SessionID;
import quickfix.field.ClOrdID;
import quickfix.field.Currency;
import quickfix.field.HandlInst;
import quickfix.field.NoPartyIDs;
import quickfix.field.OrdType;
import quickfix.field.OrderQty;
import quickfix.field.PartyID;
import quickfix.field.PartyIDSource;
import quickfix.field.PartyRole;
import quickfix.field.Price;
import quickfix.field.QuoteID;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TimeInForce;
import quickfix.field.TransactTime;
import quickfix.fix44.NewOrderSingle;

public class OrderRequest {
	public static NewOrderSingle sendOrderRequest(JsonObject crs) {


		StructNewOrderSingle objNewOrder = new StructNewOrderSingle();
		try {
			objNewOrder.setClOrdID(crs.get("Order_ID").getAsString());
			objNewOrder.setQuoteID(crs.get("Quote_ID").getAsString()); // Generated by FIX server

			objNewOrder.setSymbol(crs.get("Symbol").getAsString());
			objNewOrder.setOrderQty(crs.get("OrderQty").getAsDouble());
			objNewOrder.setSide((crs.get("Side")).getAsString().charAt(0)=='1'?Side.BUY:Side.SELL);
			objNewOrder.setPrice(crs.get("Price").getAsDouble());
			System.out.println("Booking Price:"+objNewOrder.getPrice());
			objNewOrder.setCurrency(crs.get("Currency").getAsString());
			
			return buildOrder(objNewOrder);
		} catch (Exception e) {

			e.printStackTrace();
		} 
		
		return null;

	}
	public static NewOrderSingle buildOrder(StructNewOrderSingle objNewOrder) throws Exception {
		try {
			NewOrderSingle newOrder = new NewOrderSingle();
			newOrder.set(new ClOrdID(objNewOrder.getClOrdID()));


			NewOrderSingle.NoPartyIDs grpPartyID = new NewOrderSingle.NoPartyIDs();
			grpPartyID.setField(new PartyID(ConfigReader.getConfigFile().getProperty("PartyID")));	//Get the party Id from Properties file
			grpPartyID.setField(new PartyIDSource('D'));		//Accepted Value only D=Proprietary
			grpPartyID.setField(new PartyRole(13));	//Accepted Value only 13=Order Origination Firm
			newOrder.addGroup(grpPartyID);
			//	  	
			newOrder.setField(new NoPartyIDs(1));

			newOrder.setField(new HandlInst(HandlInst.AUTOMATED_EXECUTION_ORDER_PRIVATE)); 
			newOrder.setField(new Symbol(objNewOrder.getSymbol()));
			newOrder.set(new Side(objNewOrder.getSide()));
			newOrder.set(new TransactTime());
			newOrder.set(new OrderQty(objNewOrder.getOrderQty()));
			newOrder.set(new OrdType(OrdType.PREVIOUSLY_QUOTED));
			newOrder.set(new Price(objNewOrder.getPrice()));
			newOrder.setField(new TimeInForce(TimeInForce.FILL_OR_KILL));

			newOrder.set(new QuoteID(objNewOrder.getQuoteID()));

			newOrder.set(new Currency(objNewOrder.getCurrency()));

			return newOrder;
		} catch (Exception e) {
			throw new Exception("Error in buildOrderAndSend() : " + e.getMessage());
		}
	}

}
