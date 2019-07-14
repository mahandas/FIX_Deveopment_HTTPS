package client;

public class FIX_MessageStructure {

	public static class StructQuoteRequest{
		
		private String QuoteReqID;
		private int NoRelatedSym;
		private int NoPartyIDs;
        private String PartyID;
        private char PartyIDSource;
        private int PartyRole;
        private String Symbol;
        private String CFICode;
        private String SecurityID;
        private String SecurityIDSource;
        private String BaseCcyDeliveryLocationType;
        private String CounterCcyDeliveryLocationType;
		private double OrderQty;
        private double OrderQty2;
        private String SettlmntTyp;
        private String FutSettDate;
        private String SettlmntTyp2;
        private String FutSettDate2;
        private String Currency;
        private char RequestFixingInfo;
        private String ExpireTime;
        private String MaturityDate;
        
        
        
        public String getMaturityDate() {
			return MaturityDate;
		}
		public void setMaturityDate(String maturityDate) {
			MaturityDate = maturityDate;
		}
		public String getQuoteReqID() {
			return QuoteReqID;
		}
		public void setQuoteReqID(String quoteReqID) {
			QuoteReqID = quoteReqID;
		}
		public int getNoRelatedSym() {
			return NoRelatedSym;
		}
		public void setNoRelatedSym(int noRelatedSym) {
			NoRelatedSym = noRelatedSym;
		}
		
		public int getNoPartyIDs() {
			return NoPartyIDs;
		}
		public void setNoPartyIDs(int noPartyIDs) {
			NoPartyIDs = noPartyIDs;
		}
		public String getPartyID() {
			return PartyID;
		}
		public void setPartyID(String partyID) {
			PartyID = partyID;
		}
		public char getPartyIDSource() {
			return PartyIDSource;
		}
		public void setPartyIDSource(char partyIDSource) {
			PartyIDSource = partyIDSource;
		}
		public int getPartyRole() {
			return PartyRole;
		}
		public void setPartyRole(int partyRole) {
			PartyRole = partyRole;
		}
		public String getSymbol() {
			return Symbol;
		}
		public void setSymbol(String symbol) {
			Symbol = symbol;
		}
		public String getCFICode() {
			return CFICode;
		}
		public void setCFICode(String cFICode) {
			CFICode = cFICode;
		}
		public String getSecurityID() {
			return SecurityID;
		}
		public void setSecurityID(String securityID) {
			SecurityID = securityID;
		}
		public String getSecurityIDSource() {
			return SecurityIDSource;
		}
		public void setSecurityIDSource(String securityIDSource) {
			SecurityIDSource = securityIDSource;
		}
		public String getBaseCcyDeliveryLocationType() {
			return BaseCcyDeliveryLocationType;
		}
		public void setBaseCcyDeliveryLocationType(String baseCcyDeliveryLocationType) {
			BaseCcyDeliveryLocationType = baseCcyDeliveryLocationType;
		}
		public String getCounterCcyDeliveryLocationType() {
			return CounterCcyDeliveryLocationType;
		}
		public void setCounterCcyDeliveryLocationType(String counterCcyDeliveryLocationType) {
			CounterCcyDeliveryLocationType = counterCcyDeliveryLocationType;
		}
		public double getOrderQty() {
			return OrderQty;
		}
		public void setOrderQty(double orderQty) {
			OrderQty = orderQty;
		}
		public double getOrderQty2() {
			return OrderQty2;
		}
		public void setOrderQty2(double orderQty2) {
			OrderQty2 = orderQty2;
		}
		public String getSettlmntTyp() {
			return SettlmntTyp;
		}
		public void setSettlmntTyp(String settlmntTyp) {
			SettlmntTyp = settlmntTyp;
		}
		public String getFutSettDate() {
			return FutSettDate;
		}
		public void setFutSettDate(String futSettDate) {
			FutSettDate = futSettDate;
		}
		public String getSettlmntTyp2() {
			return SettlmntTyp2;
		}
		public void setSettlmntTyp2(String settlmntTyp2) {
			SettlmntTyp2 = settlmntTyp2;
		}
		public String getFutSettDate2() {
			return FutSettDate2;
		}
		public void setFutSettDate2(String futSettDate2) {
			FutSettDate2 = futSettDate2;
		}
		public String getCurrency() {
			return Currency;
		}
		public void setCurrency(String currency) {
			Currency = currency;
		}
		public char getRequestFixingInfo() {
			return RequestFixingInfo;
		}
		public void setRequestFixingInfo(char requestFixingInfo) {
			RequestFixingInfo = requestFixingInfo;
		}
		public String getExpireTime() {
			return ExpireTime;
		}
		public void setExpireTime(String expireTime) {
			ExpireTime = expireTime;
		}

        
	}
	public static class StructQuoteRequestReject{
		private String QuoteReqID;
		private String QuoteRequestRejectReason;
		private int NoRelatedSym;
		private String Symbol;
		private String CFICode;
		private String SecurityID;
		private String SecurityIDSource;
		private String BaseCcyDeliveryLocationType;
        private String CounterCcyDeliveryLocationType;
		private double OrderQty;
        private double OrderQty2;
        private String SettlmntTyp;
        private String FutSettDate;
        private String SettlmntTyp2;
        private String FutSettDate2;
        private String Currency;
        private String Text;
		public String getQuoteReqID() {
			return QuoteReqID;
		}
		public void setQuoteReqID(String quoteReqID) {
			QuoteReqID = quoteReqID;
		}
		public String getQuoteRequestRejectReason() {
			return QuoteRequestRejectReason;
		}
		public void setQuoteRequestRejectReason(String quoteRequestRejectReason) {
			QuoteRequestRejectReason = quoteRequestRejectReason;
		}
		public int getNoRelatedSym() {
			return NoRelatedSym;
		}
		public void setNoRelatedSym(int noRelatedSym) {
			NoRelatedSym = noRelatedSym;
		}
		public String getSymbol() {
			return Symbol;
		}
		public void setSymbol(String symbol) {
			Symbol = symbol;
		}
		public String getSecurityID() {
			return SecurityID;
		}
		public void setSecurityID(String securityID) {
			SecurityID = securityID;
		}
		public String getCFICode() {
			return CFICode;
		}
		public void setCFICode(String cFICode) {
			CFICode = cFICode;
		}
		public String getSecurityIDSource() {
			return SecurityIDSource;
		}
		public void setSecurityIDSource(String securityIDSource) {
			SecurityIDSource = securityIDSource;
		}
		public String getBaseCcyDeliveryLocationType() {
			return BaseCcyDeliveryLocationType;
		}
		public void setBaseCcyDeliveryLocationType(String baseCcyDeliveryLocationType) {
			BaseCcyDeliveryLocationType = baseCcyDeliveryLocationType;
		}
		public String getCounterCcyDeliveryLocationType() {
			return CounterCcyDeliveryLocationType;
		}
		public void setCounterCcyDeliveryLocationType(String counterCcyDeliveryLocationType) {
			CounterCcyDeliveryLocationType = counterCcyDeliveryLocationType;
		}
		public double getOrderQty() {
			return OrderQty;
		}
		public void setOrderQty(double orderQty) {
			OrderQty = orderQty;
		}
		public double getOrderQty2() {
			return OrderQty2;
		}
		public void setOrderQty2(double orderQty2) {
			OrderQty2 = orderQty2;
		}
		public String getSettlmntTyp() {
			return SettlmntTyp;
		}
		public void setSettlmntTyp(String settlmntTyp) {
			SettlmntTyp = settlmntTyp;
		}
		public String getFutSettDate() {
			return FutSettDate;
		}
		public void setFutSettDate(String futSettDate) {
			FutSettDate = futSettDate;
		}
		public String getSettlmntTyp2() {
			return SettlmntTyp2;
		}
		public void setSettlmntTyp2(String settlmntTyp2) {
			SettlmntTyp2 = settlmntTyp2;
		}
		public String getFutSettDate2() {
			return FutSettDate2;
		}
		public void setFutSettDate2(String futSettDate2) {
			FutSettDate2 = futSettDate2;
		}
		public String getCurrency() {
			return Currency;
		}
		public void setCurrency(String currency) {
			Currency = currency;
		}
		public String getText() {
			return Text;
		}
		public void setText(String text) {
			Text = text;
		}
        
		
	}
	 public static class StructQuote{         
		 private String QuoteReqID;
		 private String QuoteID;
		 private String Symbol;
	     private String CFICode;
	     private String SecurityID;
	     private String SecurityIDSource;
	     private String BaseCcyDeliveryLocationType;
	     private String CounterCcyDeliveryLocationType;
	     private String MaturityDate;
	     private String MaturityDate2;
	     private String FixingReference;
	     private String ValidUntilTime;
	     private double BidPx;
	     private double OfferPx;
	     private double BidSize;
	     private double OfferSize;
	     private double BidSpotRate;
	     private double OfferSpotRate;
	     private double BidForwardPoints;
	     private double BidForwardPoints2;
	     private double OfferForwardPoints;
	     private double OfferForwardPoints2;
	     private String FutSettDate;
	     private String FutSettDate2;
	     private Double OrderQty2;
	     private String Currency;
	     private String ExpireTime;
	     private double BidSwapPoints;
	     private double OfferSwapPoints;
	     
		public String getQuoteReqID() {
			return QuoteReqID;
		}
		public void setQuoteReqID(String quoteReqID) {
			QuoteReqID = quoteReqID;
		}
		public String getQuoteID() {
			return QuoteID;
		}
		public void setQuoteID(String quoteID) {
			QuoteID = quoteID;
		}
		public String getSymbol() {
			return Symbol;
		}
		public void setSymbol(String symbol) {
			Symbol = symbol;
		}
		public String getCFICode() {
			return CFICode;
		}
		public void setCFICode(String cFICode) {
			CFICode = cFICode;
		}
		public String getSecurityID() {
			return SecurityID;
		}
		public void setSecurityID(String securityID) {
			SecurityID = securityID;
		}
		public String getSecurityIDSource() {
			return SecurityIDSource;
		}
		public void setSecurityIDSource(String securityIDSource) {
			SecurityIDSource = securityIDSource;
		}
		public String getBaseCcyDeliveryLocationType() {
			return BaseCcyDeliveryLocationType;
		}
		public void setBaseCcyDeliveryLocationType(String baseCcyDeliveryLocationType) {
			BaseCcyDeliveryLocationType = baseCcyDeliveryLocationType;
		}
		public String getCounterCcyDeliveryLocationType() {
			return CounterCcyDeliveryLocationType;
		}
		public void setCounterCcyDeliveryLocationType(String counterCcyDeliveryLocationType) {
			CounterCcyDeliveryLocationType = counterCcyDeliveryLocationType;
		}
		public String getMaturityDate() {
			return MaturityDate;
		}
		public void setMaturityDate(String maturityDate) {
			MaturityDate = maturityDate;
		}
		public String getMaturityDate2() {
			return MaturityDate2;
		}
		public void setMaturityDate2(String maturityDate2) {
			MaturityDate2 = maturityDate2;
		}
		public String getFixingReference() {
			return FixingReference;
		}
		public void setFixingReference(String fixingReference) {
			FixingReference = fixingReference;
		}
		public String getValidUntilTime() {
			return ValidUntilTime;
		}
		public void setValidUntilTime(String validUntilTime) {
			ValidUntilTime = validUntilTime;
		}
		public double getBidPx() {
			return BidPx;
		}
		public void setBidPx(double bidPx) {
			BidPx = bidPx;
		}
		public double getOfferPx() {
			return OfferPx;
		}
		public void setOfferPx(double offerPx) {
			OfferPx = offerPx;
		}
		public double getBidSize() {
			return BidSize;
		}
		public void setBidSize(double bidSize) {
			BidSize = bidSize;
		}
		public double getOfferSize() {
			return OfferSize;
		}
		public void setOfferSize(double offerSize) {
			OfferSize = offerSize;
		}
		public double getBidSpotRate() {
			return BidSpotRate;
		}
		public void setBidSpotRate(double bidSpotRate) {
			BidSpotRate = bidSpotRate;
		}
		public double getOfferSpotRate() {
			return OfferSpotRate;
		}
		public void setOfferSpotRate(double offerSpotRate) {
			OfferSpotRate = offerSpotRate;
		}
		public double getBidForwardPoints() {
			return BidForwardPoints;
		}
		public void setBidForwardPoints(double bidForwardPoints) {
			BidForwardPoints = bidForwardPoints;
		}
		public double getBidForwardPoints2() {
			return BidForwardPoints2;
		}
		public void setBidForwardPoints2(double bidForwardPoints2) {
			BidForwardPoints2 = bidForwardPoints2;
		}
		public double getOfferForwardPoints() {
			return OfferForwardPoints;
		}
		public void setOfferForwardPoints(double offerForwardPoints) {
			OfferForwardPoints = offerForwardPoints;
		}
		public double getOfferForwardPoints2() {
			return OfferForwardPoints2;
		}
		public void setOfferForwardPoints2(double offerForwardPoints2) {
			OfferForwardPoints2 = offerForwardPoints2;
		}
		public String getFutSettDate() {
			return FutSettDate;
		}
		public void setFutSettDate(String futSettDate) {
			FutSettDate = futSettDate;
		}
		public String getFutSettDate2() {
			return FutSettDate2;
		}
		public void setFutSettDate2(String futSettDate2) {
			FutSettDate2 = futSettDate2;
		}
		public Double getOrderQty2() {
			return OrderQty2;
		}
		public void setOrderQty2(Double orderQty2) {
			OrderQty2 = orderQty2;
		}
		public String getCurrency() {
			return Currency;
		}
		public void setCurrency(String currency) {
			Currency = currency;
		}
		public String getExpireTime() {
			return ExpireTime;
		}
		public void setExpireTime(String expireTime) {
			ExpireTime = expireTime;
		}
		public double getBidSwapPoints() {
			return BidSwapPoints;
		}
		public void setBidSwapPoints(double bidSwapPoints) {
			BidSwapPoints = bidSwapPoints;
		}
		public double getOfferSwapPoints() {
			return OfferSwapPoints;
		}
		public void setOfferSwapPoints(double offerSwapPoints) {
			OfferSwapPoints = offerSwapPoints;
		}
	     	     
	 }
	 public static class StructNewOrderSingle {
	    private String ClOrdID;
	    private String MDReqID;
	    private int NoPartyIDs;
        private String PartyID;
        private char PartyIDSource;
        private int PartyRole;
	    private String FutSettDate;
	    private String FutSettDate2;
	    private char HandlInst;
	    private String Symbol;
	    private String CFICode;
	    private String SecurityID;
	    private String SecurityIDSource;
        private String BaseCcyDeliveryLocationType;
        private String CounterCcyDeliveryLocationType;
        private char RequestFixingInfo;
        private char Side;
        private String TransactTime;
        private double OrderQty;
        private double OrderQty2;
        private char OrdType;
        private double Price;
        private double Price2;
        private String Currency;
        private String QuoteID;
        private char TimeInForce;
        private String ExecInst;
        private String USIIssuerId;
        private String USITradeId;
        private String FarUSIIssuerId;
        private String FarUSITradeId;
        private int LimitPxType;
        private int NoAllocs;
        private String AllocAccount;
        private double AllocQty;
        private String AllocId;
        private double AllocQty2;
        
		public char getOrdType() {
			return OrdType;
		}
		public void setOrdType(char ordType) {
			OrdType = ordType;
		}
		public String getClOrdID() {
			return ClOrdID;
		}
		public void setClOrdID(String clOrdID) {
			ClOrdID = clOrdID;
		}
		public String getMDReqID() {
			return MDReqID;
		}
		public void setMDReqID(String mDReqID) {
			MDReqID = mDReqID;
		}
		public int getNoPartyIDs() {
			return NoPartyIDs;
		}
		public void setNoPartyIDs(int noPartyIDs) {
			NoPartyIDs = noPartyIDs;
		}
		public String getPartyID() {
			return PartyID;
		}
		public void setPartyID(String partyID) {
			PartyID = partyID;
		}
		public char getPartyIDSource() {
			return PartyIDSource;
		}
		public void setPartyIDSource(char partyIDSource) {
			PartyIDSource = partyIDSource;
		}
		public int getPartyRole() {
			return PartyRole;
		}
		public void setPartyRole(int partyRole) {
			PartyRole = partyRole;
		}
		public String getFutSettDate() {
			return FutSettDate;
		}
		public void setFutSettDate(String futSettDate) {
			FutSettDate = futSettDate;
		}
		public String getFutSettDate2() {
			return FutSettDate2;
		}
		public void setFutSettDate2(String futSettDate2) {
			FutSettDate2 = futSettDate2;
		}
		public char getHandlInst() {
			return HandlInst;
		}
		public void setHandlInst(char handlInst) {
			HandlInst = handlInst;
		}
		public String getSymbol() {
			return Symbol;
		}
		public void setSymbol(String symbol) {
			Symbol = symbol;
		}
		public String getCFICode() {
			return CFICode;
		}
		public void setCFICode(String cFICode) {
			CFICode = cFICode;
		}
		public String getSecurityID() {
			return SecurityID;
		}
		public void setSecurityID(String securityID) {
			SecurityID = securityID;
		}
		public String getSecurityIDSource() {
			return SecurityIDSource;
		}
		public void setSecurityIDSource(String securityIDSource) {
			SecurityIDSource = securityIDSource;
		}
		public String getBaseCcyDeliveryLocationType() {
			return BaseCcyDeliveryLocationType;
		}
		public void setBaseCcyDeliveryLocationType(String baseCcyDeliveryLocationType) {
			BaseCcyDeliveryLocationType = baseCcyDeliveryLocationType;
		}
		public String getCounterCcyDeliveryLocationType() {
			return CounterCcyDeliveryLocationType;
		}
		public void setCounterCcyDeliveryLocationType(String counterCcyDeliveryLocationType) {
			CounterCcyDeliveryLocationType = counterCcyDeliveryLocationType;
		}
		public char getRequestFixingInfo() {
			return RequestFixingInfo;
		}
		public void setRequestFixingInfo(char requestFixingInfo) {
			RequestFixingInfo = requestFixingInfo;
		}
		public char getSide() {
			return Side;
		}
		public void setSide(char side) {
			Side = side;
		}
		public String getTransactTime() {
			return TransactTime;
		}
		public void setTransactTime(String transactTime) {
			TransactTime = transactTime;
		}
		public double getOrderQty() {
			return OrderQty;
		}
		public void setOrderQty(double orderQty) {
			OrderQty = orderQty;
		}
		public double getOrderQty2() {
			return OrderQty2;
		}
		public void setOrderQty2(double orderQty2) {
			OrderQty2 = orderQty2;
		}
		public double getPrice() {
			return Price;
		}
		public void setPrice(double price) {
			Price = price;
		}
		public double getPrice2() {
			return Price2;
		}
		public void setPrice2(double price2) {
			Price2 = price2;
		}
		public String getCurrency() {
			return Currency;
		}
		public void setCurrency(String currency) {
			Currency = currency;
		}
		public String getQuoteID() {
			return QuoteID;
		}
		public void setQuoteID(String quoteID) {
			QuoteID = quoteID;
		}
		public char getTimeInForce() {
			return TimeInForce;
		}
		public void setTimeInForce(char timeInForce) {
			TimeInForce = timeInForce;
		}
		public String getExecInst() {
			return ExecInst;
		}
		public void setExecInst(String execInst) {
			ExecInst = execInst;
		}
		public String getUSIIssuerId() {
			return USIIssuerId;
		}
		public void setUSIIssuerId(String uSIIssuerId) {
			USIIssuerId = uSIIssuerId;
		}
		public String getUSITradeId() {
			return USITradeId;
		}
		public void setUSITradeId(String uSITradeId) {
			USITradeId = uSITradeId;
		}
		public String getFarUSIIssuerId() {
			return FarUSIIssuerId;
		}
		public void setFarUSIIssuerId(String farUSIIssuerId) {
			FarUSIIssuerId = farUSIIssuerId;
		}
		public String getFarUSITradeId() {
			return FarUSITradeId;
		}
		public void setFarUSITradeId(String farUSITradeId) {
			FarUSITradeId = farUSITradeId;
		}
		public int getLimitPxType() {
			return LimitPxType;
		}
		public void setLimitPxType(int limitPxType) {
			LimitPxType = limitPxType;
		}
		public int getNoAllocs() {
			return NoAllocs;
		}
		public void setNoAllocs(int noAllocs) {
			NoAllocs = noAllocs;
		}
		public String getAllocAccount() {
			return AllocAccount;
		}
		public void setAllocAccount(String allocAccount) {
			AllocAccount = allocAccount;
		}
		public double getAllocQty() {
			return AllocQty;
		}
		public void setAllocQty(double allocQty) {
			AllocQty = allocQty;
		}
		public String getAllocId() {
			return AllocId;
		}
		public void setAllocId(String allocId) {
			AllocId = allocId;
		}
		public double getAllocQty2() {
			return AllocQty2;
		}
		public void setAllocQty2(double allocQty2) {
			AllocQty2 = allocQty2;
		}
        
	 }
		public static class StructExecutionReport{
		        
		        private String OrderID;
		        private String ClOrdID;
		        private String ExecID;
		        private char ExecType;
		        private char OrdStatus;
		        private String OrdRejReason;
		        private String FutSettDate;
		        private String FutSettDate2;
		        private String Symbol;
		        private String CFICode;
		        private String SecurityID;
		        private String SecurityIDSource;
		        private String BaseCcyDeliveryLocationType;
		        private String CounterCcyDeliveryLocationType;
		        private String MaturityDate;
		        private String MaturityDate2;
		        private String FixingReference;
		        private char Side;
		        private double OrderQty;
		        private double OrderQty2;
		        private char OrdType;
		        private double Price;
		        private double Price2;
		        private String Currency;
		        private char TimeInForce;
		        private double LastQty;
		        private double LastPx;
		        private double LastSpotRate;
		        private double LastForwardPoints;
		        private double LastForwardPoints2;
		        private double LeavesQty;
		        private double CumQty;
		        private String USIIssuerId;
		        private String USITradeId;
		        private String FarUSIIssuerId;
		        private String FarUSITradeId;
		        private double AvgPx;
		        private String Text;
		        private int NoExecs;
		        private String AllocAccount;
		        private String AllocId;
				public String getOrderID() {
					return OrderID;
				}
				public void setOrderID(String orderID) {
					OrderID = orderID;
				}
				public String getClOrdID() {
					return ClOrdID;
				}
				public void setClOrdID(String clOrdID) {
					ClOrdID = clOrdID;
				}
				public String getExecID() {
					return ExecID;
				}
				public void setExecID(String execID) {
					ExecID = execID;
				}
				public char getExecType() {
					return ExecType;
				}
				public void setExecType(char execType) {
					ExecType = execType;
				}
				public char getOrdStatus() {
					return OrdStatus;
				}
				public void setOrdStatus(char ordStatus) {
					OrdStatus = ordStatus;
				}
				public String getOrdRejReason() {
					return OrdRejReason;
				}
				public void setOrdRejReason(String ordRejReason) {
					OrdRejReason = ordRejReason;
				}
				public String getFutSettDate() {
					return FutSettDate;
				}
				public void setFutSettDate(String futSettDate) {
					FutSettDate = futSettDate;
				}
				public String getFutSettDate2() {
					return FutSettDate2;
				}
				public void setFutSettDate2(String futSettDate2) {
					FutSettDate2 = futSettDate2;
				}
				public String getSymbol() {
					return Symbol;
				}
				public void setSymbol(String symbol) {
					Symbol = symbol;
				}
				public String getCFICode() {
					return CFICode;
				}
				public void setCFICode(String cFICode) {
					CFICode = cFICode;
				}
				public String getSecurityID() {
					return SecurityID;
				}
				public void setSecurityID(String securityID) {
					SecurityID = securityID;
				}
				public String getSecurityIDSource() {
					return SecurityIDSource;
				}
				public void setSecurityIDSource(String securityIDSource) {
					SecurityIDSource = securityIDSource;
				}
				public String getBaseCcyDeliveryLocationType() {
					return BaseCcyDeliveryLocationType;
				}
				public void setBaseCcyDeliveryLocationType(String baseCcyDeliveryLocationType) {
					BaseCcyDeliveryLocationType = baseCcyDeliveryLocationType;
				}
				public String getCounterCcyDeliveryLocationType() {
					return CounterCcyDeliveryLocationType;
				}
				public void setCounterCcyDeliveryLocationType(String counterCcyDeliveryLocationType) {
					CounterCcyDeliveryLocationType = counterCcyDeliveryLocationType;
				}
				public String getMaturityDate() {
					return MaturityDate;
				}
				public void setMaturityDate(String maturityDate) {
					MaturityDate = maturityDate;
				}
				public String getMaturityDate2() {
					return MaturityDate2;
				}
				public void setMaturityDate2(String maturityDate2) {
					MaturityDate2 = maturityDate2;
				}
				public String getFixingReference() {
					return FixingReference;
				}
				public void setFixingReference(String fixingReference) {
					FixingReference = fixingReference;
				}
				public char getSide() {
					return Side;
				}
				public void setSide(char side) {
					Side = side;
				}
				public double getOrderQty() {
					return OrderQty;
				}
				public void setOrderQty(double orderQty) {
					OrderQty = orderQty;
				}
				public double getOrderQty2() {
					return OrderQty2;
				}
				public void setOrderQty2(double orderQty2) {
					OrderQty2 = orderQty2;
				}
				public char getOrdType() {
					return OrdType;
				}
				public void setOrdType(char ordType) {
					OrdType = ordType;
				}
				public double getPrice() {
					return Price;
				}
				public void setPrice(double price) {
					Price = price;
				}
				public double getPrice2() {
					return Price2;
				}
				public void setPrice2(double price2) {
					Price2 = price2;
				}
				public String getCurrency() {
					return Currency;
				}
				public void setCurrency(String currency) {
					Currency = currency;
				}
				public char getTimeInForce() {
					return TimeInForce;
				}
				public void setTimeInForce(char timeInForce) {
					TimeInForce = timeInForce;
				}
				public double getLastQty() {
					return LastQty;
				}
				public void setLastQty(double lastQty) {
					LastQty = lastQty;
				}
				public double getLastPx() {
					return LastPx;
				}
				public void setLastPx(double lastPx) {
					LastPx = lastPx;
				}
				public double getLastSpotRate() {
					return LastSpotRate;
				}
				public void setLastSpotRate(double lastSpotRate) {
					LastSpotRate = lastSpotRate;
				}
				public double getLastForwardPoints() {
					return LastForwardPoints;
				}
				public void setLastForwardPoints(double lastForwardPoints) {
					LastForwardPoints = lastForwardPoints;
				}
				public double getLastForwardPoints2() {
					return LastForwardPoints2;
				}
				public void setLastForwardPoints2(double lastForwardPoints2) {
					LastForwardPoints2 = lastForwardPoints2;
				}
				public double getLeavesQty() {
					return LeavesQty;
				}
				public void setLeavesQty(double leavesQty) {
					LeavesQty = leavesQty;
				}
				public double getCumQty() {
					return CumQty;
				}
				public void setCumQty(double cumQty) {
					CumQty = cumQty;
				}
				public String getUSIIssuerId() {
					return USIIssuerId;
				}
				public void setUSIIssuerId(String uSIIssuerId) {
					USIIssuerId = uSIIssuerId;
				}
				public String getUSITradeId() {
					return USITradeId;
				}
				public void setUSITradeId(String uSITradeId) {
					USITradeId = uSITradeId;
				}
				public String getFarUSIIssuerId() {
					return FarUSIIssuerId;
				}
				public void setFarUSIIssuerId(String farUSIIssuerId) {
					FarUSIIssuerId = farUSIIssuerId;
				}
				public String getFarUSITradeId() {
					return FarUSITradeId;
				}
				public void setFarUSITradeId(String farUSITradeId) {
					FarUSITradeId = farUSITradeId;
				}
				public double getAvgPx() {
					return AvgPx;
				}
				public void setAvgPx(double avgPx) {
					AvgPx = avgPx;
				}
				public String getText() {
					return Text;
				}
				public void setText(String text) {
					Text = text;
				}
				public int getNoExecs() {
					return NoExecs;
				}
				public void setNoExecs(int noExecs) {
					NoExecs = noExecs;
				}
				public String getAllocAccount() {
					return AllocAccount;
				}
				public void setAllocAccount(String allocAccount) {
					AllocAccount = allocAccount;
				}
				public String getAllocId() {
					return AllocId;
				}
				public void setAllocId(String allocId) {
					AllocId = allocId;
				}
		        
		      		        
		  }
		public static class StructQuoteCancel{
			
			private String QuoteReqID;
			private int QuoteCancelType;
			private String Symbol;
			private String BaseCcyDeliveryLocationType;
	        private String CounterCcyDeliveryLocationType;
			public String getQuoteReqID() {
				return QuoteReqID;
			}
			public void setQuoteReqID(String quoteReqID) {
				QuoteReqID = quoteReqID;
			}
			public int getQuoteCancelType() {
				return QuoteCancelType;
			}
			public void setQuoteCancelType(int quoteCancelType) {
				QuoteCancelType = quoteCancelType;
			}
			public String getSymbol() {
				return Symbol;
			}
			public void setSymbol(String symbol) {
				Symbol = symbol;
			}
			public String getBaseCcyDeliveryLocationType() {
				return BaseCcyDeliveryLocationType;
			}
			public void setBaseCcyDeliveryLocationType(String baseCcyDeliveryLocationType) {
				BaseCcyDeliveryLocationType = baseCcyDeliveryLocationType;
			}
			public String getCounterCcyDeliveryLocationType() {
				return CounterCcyDeliveryLocationType;
			}
			public void setCounterCcyDeliveryLocationType(String counterCcyDeliveryLocationType) {
				CounterCcyDeliveryLocationType = counterCcyDeliveryLocationType;
			}
	        
		}
		public static class StructDontKnowTrade {
	        private String OrderID;
	        private String ExecID;
	        private char DKReason;
	        private String Symbol;
	        private int Side;
	        private double OrderQty;
	        private String text;
	        
			public String getOrderID() {
				return OrderID;
			}
			public void setOrderID(String orderID) {
				OrderID = orderID;
			}
			public String getExecID() {
				return ExecID;
			}
			public void setExecID(String execID) {
				ExecID = execID;
			}
			public char getDKReason() {
				return DKReason;
			}
			public void setDKReason(char dKReason) {
				DKReason = dKReason;
			}
			public String getSymbol() {
				return Symbol;
			}
			public void setSymbol(String symbol) {
				Symbol = symbol;
			}
			public int getSide() {
				return Side;
			}
			public void setSide(int side) {
				Side = side;
			}
			public double getOrderQty() {
				return OrderQty;
			}
			public void setOrderQty(double d) {
				OrderQty = d;
			}
			public String getText() {
				return text;
			}
			public void setText(String text) {
				this.text = text;
			}
	        
		}
		  public static class StructMassQuoteAck {
		        private String quoteReqID;
		        private String quoteAckStatus;
		        private String tradingSessionId;
		        private String quoteRejectReason;
		        private String text;

		        public void setQuoteReqID(String quoteReqID) {
		            this.quoteReqID = quoteReqID;
		        }

		        public String getQuoteReqID() {
		            return quoteReqID;
		        }

		        public void setQuoteAckStatus(String quoteAckStatus) {
		            this.quoteAckStatus = quoteAckStatus;
		        }

		        public String getQuoteAckStatus() {
		            return quoteAckStatus;
		        }

		        public void setTradingSessionId(String tradingSessionId) {
		            this.tradingSessionId = tradingSessionId;
		        }

		        public String getTradingSessionId() {
		            return tradingSessionId;
		        }

		        public void setQuoteRejectReason(String quoteRejectReason) {
		            this.quoteRejectReason = quoteRejectReason;
		        }

		        public String getQuoteRejectReason() {
		            return quoteRejectReason;
		        }

		        public void setText(String text) {
		            this.text = text;
		        }

		        public String getText() {
		            return text;
		        }
		    }
		/**
		 * @author sarvanan.govindam
		 *
		 */
		public static class StructResponseMessage{
		       
		        private String PP_CODE;
		        private String MSGTYPE;
		        private String FPRD_RFQ_ID;
		        private String FPRD_RFQ_Request_ID;
		        private String FPRD_GRFS_ID;
		        private String FPRD_Quote_ID;
		        private String FPRD_Internal_Order_ID;
		        private String FPRD_External_Order_ID;
		        private String FPRD_External_Execution_ID;
		        private String FPRD_FX_Product_Type;
		        private String FPRD_FX_TradingSession_ID;
		        private String FPRD_Deal_Pair;
		        private String FPRD_Deal_Type;
		        private String FPRD_Quoted_Ccy;
		        private String FPRD_Ccy1;
		        private String FPRD_Ccy2;
		        private String FPRD_All_In_Rate;
		        private String FPRD_Bid_Price;
		        private String FPRD_Offer_Price;
		        private String FPRD_Far_All_In_Rate;
		        private String FPRD_Bid_Far_Price;
		        private String FPRD_Offer_Far_Price;
		        private String FPRD_Bid_Spot_Rate;
		        private String FPRD_Offer_Spot_Rate;
		        private String FPRD_Spot_Rate;
		        private String FPRD_Valid_Until_Time;
		        private String FPRD_Bid_Forward_Points;
		        private String FPRD_Offer_Forward_Points;
		        private String FPRD_Forward_Points;
		        private String FPRD_Bid_Far_Forward_Points;
		        private String FPRD_Offer_Far_Forward_Points;
		        private String FPRD_Far_Forward_Points;
		        private String FPRD_Swap_Points;
		        private String FPRD_Bid_Swap_Points;
		        private String FPRD_Offer_Swap_Points;
		        private String FPRD_Trade_Date;
		        private String FPRD_Value_Date;
		        private String FPRD_Fixing_Date;
		        private String FPRD_Maturity_Date;
		        private String FPRD_Quote_State;
		        private String FPRD_Order_Price;
		        private String FPRD_Order_Fill_Amount;
		        private String FPRD_Last_Spot_Rate;
		        private String FPRD_Last_Fwd_Points;
		        private String FPRD_Order_Pending_Qty;
		        private String FPRD_Order_Settlement_Date;
		        private String FPRD_Order_All_In_Rate;
		        private String FPRD_Order_Fill_Qty;
		        private String FPRD_Order_Average_price;
		        private String FPRD_Last_Price;
		        private String FPRD_Order_Min_Qty;
		        private String FPRD_Order_Settlement_Date2;
		        private String FPRD_Order_All_In_Rate2;
		        private String FPRD_Order_Fill_Qty2;
		        private String FPRD_Order_Avarage_Price2;
		        private String FPRD_Last_Price2;
		        private String FPRD_Order_Min_Qty2;
		        private String FPRD_Trade_Exec_Type;
		        private String FPRD_Trade_Order_Status;
		        private String FPRD_Trade_Book_Status;
		        private String FPRD_Quote_Ack_Status;
		        private String FPRD_Quote_Request_Rejection_Reason;
		        private String FPRD_Quote_Rejection_Reason;
		        private String FPRD_Quote_Cancel_Type;
		        private String FPRD_Quote_Cancel_Level;
		        private String FPRD_Quote_Request_YN;
		        private String FPRD_Quote_Request_At;
		        private String FPRD_Quote_Request_By;
		        private String FPRD_Quote_Response_YN;
		        private String FPRD_Quote_Response_At;
		        private String FPRD_Quote_Response_By;
		        private String FPRD_Acknowledged_At;
		        private String FPRD_Acknowledged_By;
		        private String FPRD_Cancelled_At;
		        private String FPRD_Cancelled_By;
		        private String FPRD_Trade_Proceed_YN;
		        private String FPRD_Trade_Proceed_At;
		        private String FPRD_Trade_Proceed_By;
		        private String FPRD_Order_Requested_YN;
		        private String FPRD_Order_Requested_At;
		        private String FPRD_Order_Requested_By;
		        private String FPRD_Order_Response_At;
		        private String FPRD_Order_Response_By;
		        private String FPRD_Created_At;
		        private String FPRD_Created_By;
		        private String FPRD_Updated_By;
		        private String FPRD_Updated_At;
		        private String FPRD_Ccy1_Amt;
		        private String FPRD_Ccy2_Amt;
		
		        public String getPP_CODE() {
		        return PP_CODE;
		        }
		        public void setPP_CODE(String pp_code) {
		         PP_CODE  =  pp_code;
		        }
		        public String getMSGTYPE() {
		        return MSGTYPE;
		        }
		        public void setMSGTYPE(String msgtype) {
		         MSGTYPE  =  msgtype;
		        }
		        public String getFPRD_RFQ_ID() {
		        return FPRD_RFQ_ID;
		        }
		        public void setFPRD_RFQ_ID(String fprd_rfq_id) {
		         FPRD_RFQ_ID  =  fprd_rfq_id;
		        }
		        public String getFPRD_RFQ_Request_ID() {
		        return FPRD_RFQ_Request_ID;
		        }
		        public void setFPRD_RFQ_Request_ID(String fprd_rfq_request_id) {
		         FPRD_RFQ_Request_ID  =  fprd_rfq_request_id;
		        }
		        public String getFPRD_GRFS_ID() {
		        return FPRD_GRFS_ID;
		        }
		        public void setFPRD_GRFS_ID(String fprd_grfs_id) {
		         FPRD_GRFS_ID  =  fprd_grfs_id;
		        }
		        public String getFPRD_Quote_ID() {
		        return FPRD_Quote_ID;
		        }
		        public void setFPRD_Quote_ID(String fprd_quote_id) {
		         FPRD_Quote_ID  =  fprd_quote_id;
		        }
		        public String getFPRD_Internal_Order_ID() {
		        return FPRD_Internal_Order_ID;
		        }
		        public void setFPRD_Internal_Order_ID(String fprd_internal_order_id) {
		         FPRD_Internal_Order_ID  =  fprd_internal_order_id;
		        }
		        public String getFPRD_External_Order_ID() {
		        return FPRD_External_Order_ID;
		        }
		        public void setFPRD_External_Order_ID(String fprd_external_order_id) {
		         FPRD_External_Order_ID  =  fprd_external_order_id;
		        }
		        public String getFPRD_External_Execution_ID() {
		        return FPRD_External_Execution_ID;
		        }
		        public void setFPRD_External_Execution_ID(String fprd_external_execution_id) {
		         FPRD_External_Execution_ID  =  fprd_external_execution_id;
		        }
		        public String getFPRD_FX_Product_Type() {
		        return FPRD_FX_Product_Type;
		        }
		        public void setFPRD_FX_Product_Type(String fprd_fx_product_type) {
		         FPRD_FX_Product_Type  =  fprd_fx_product_type;
		        }
		        public String getFPRD_FX_TradingSession_ID() {
		        return FPRD_FX_TradingSession_ID;
		        }
		        public void setFPRD_FX_TradingSession_ID(String fprd_fx_tradingsession_id) {
		         FPRD_FX_TradingSession_ID  =  fprd_fx_tradingsession_id;
		        }
		        public String getFPRD_Deal_Pair() {
		        return FPRD_Deal_Pair;
		        }
		        public void setFPRD_Deal_Pair(String fprd_deal_pair) {
		         FPRD_Deal_Pair  =  fprd_deal_pair;
		        }
		        public String getFPRD_Deal_Type() {
		        return FPRD_Deal_Type;
		        }
		        public void setFPRD_Deal_Type(String fprd_deal_type) {
		         FPRD_Deal_Type  =  fprd_deal_type;
		        }
		        public String getFPRD_Quoted_Ccy() {
		        return FPRD_Quoted_Ccy;
		        }
		        public void setFPRD_Quoted_Ccy(String fprd_quoted_ccy) {
		         FPRD_Quoted_Ccy  =  fprd_quoted_ccy;
		        }
		        public String getFPRD_Ccy1() {
		        return FPRD_Ccy1;
		        }
		        public void setFPRD_Ccy1(String fprd_ccy1) {
		         FPRD_Ccy1  =  fprd_ccy1;
		        }
		        public String getFPRD_Ccy2() {
		        return FPRD_Ccy2;
		        }
		        public void setFPRD_Ccy2(String fprd_ccy2) {
		         FPRD_Ccy2  =  fprd_ccy2;
		        }
		        public String getFPRD_All_In_Rate() {
		        return FPRD_All_In_Rate;
		        }
		        public void setFPRD_All_In_Rate(String fprd_all_in_rate) {
		         FPRD_All_In_Rate  =  fprd_all_in_rate;
		        }
		        public String getFPRD_Bid_Price() {
		        return FPRD_Bid_Price;
		        }
		        public void setFPRD_Bid_Price(String fprd_bid_price) {
		         FPRD_Bid_Price  =  fprd_bid_price;
		        }
		        public String getFPRD_Offer_Price() {
		        return FPRD_Offer_Price;
		        }
		        public void setFPRD_Offer_Price(String fprd_offer_price) {
		         FPRD_Offer_Price  =  fprd_offer_price;
		        }
		        public String getFPRD_Far_All_In_Rate() {
		        return FPRD_Far_All_In_Rate;
		        }
		        public void setFPRD_Far_All_In_Rate(String fprd_far_all_in_rate) {
		         FPRD_Far_All_In_Rate  =  fprd_far_all_in_rate;
		        }
		        public String getFPRD_Bid_Far_Price() {
		        return FPRD_Bid_Far_Price;
		        }
		        public void setFPRD_Bid_Far_Price(String fprd_bid_far_price) {
		         FPRD_Bid_Far_Price  =  fprd_bid_far_price;
		        }
		        public String getFPRD_Offer_Far_Price() {
		        return FPRD_Offer_Far_Price;
		        }
		        public void setFPRD_Offer_Far_Price(String fprd_offer_far_price) {
		         FPRD_Offer_Far_Price  =  fprd_offer_far_price;
		        }
		        public String getFPRD_Bid_Spot_Rate() {
		        return FPRD_Bid_Spot_Rate;
		        }
		        public void setFPRD_Bid_Spot_Rate(String fprd_bid_spot_rate) {
		         FPRD_Bid_Spot_Rate  =  fprd_bid_spot_rate;
		        }
		        public String getFPRD_Offer_Spot_Rate() {
		        return FPRD_Offer_Spot_Rate;
		        }
		        public void setFPRD_Offer_Spot_Rate(String fprd_offer_spot_rate) {
		         FPRD_Offer_Spot_Rate  =  fprd_offer_spot_rate;
		        }
		        public String getFPRD_Spot_Rate() {
		        return FPRD_Spot_Rate;
		        }
		        public void setFPRD_Spot_Rate(String fprd_spot_rate) {
		         FPRD_Spot_Rate  =  fprd_spot_rate;
		        }
		        public String getFPRD_Valid_Until_Time() {
		        return FPRD_Valid_Until_Time;
		        }
		        public void setFPRD_Valid_Until_Time(String fprd_valid_until_time) {
		         FPRD_Valid_Until_Time  =  fprd_valid_until_time;
		        }
		        public String getFPRD_Bid_Forward_Points() {
		        return FPRD_Bid_Forward_Points;
		        }
		        public void setFPRD_Bid_Forward_Points(String fprd_bid_forward_points) {
		         FPRD_Bid_Forward_Points  =  fprd_bid_forward_points;
		        }
		        public String getFPRD_Offer_Forward_Points() {
		        return FPRD_Offer_Forward_Points;
		        }
		        public void setFPRD_Offer_Forward_Points(String fprd_offer_forward_points) {
		         FPRD_Offer_Forward_Points  =  fprd_offer_forward_points;
		        }
		        public String getFPRD_Forward_Points() {
		        return FPRD_Forward_Points;
		        }
		        public void setFPRD_Forward_Points(String fprd_forward_points) {
		         FPRD_Forward_Points  =  fprd_forward_points;
		        }
		        public String getFPRD_Bid_Far_Forward_Points() {
		        return FPRD_Bid_Far_Forward_Points;
		        }
		        public void setFPRD_Bid_Far_Forward_Points(String fprd_bid_far_forward_points) {
		         FPRD_Bid_Far_Forward_Points  =  fprd_bid_far_forward_points;
		        }
		        public String getFPRD_Offer_Far_Forward_Points() {
		        return FPRD_Offer_Far_Forward_Points;
		        }
		        public void setFPRD_Offer_Far_Forward_Points(String fprd_offer_far_forward_points) {
		         FPRD_Offer_Far_Forward_Points  =  fprd_offer_far_forward_points;
		        }
		        public String getFPRD_Far_Forward_Points() {
		        return FPRD_Far_Forward_Points;
		        }
		        public void setFPRD_Far_Forward_Points(String fprd_far_forward_points) {
		         FPRD_Far_Forward_Points  =  fprd_far_forward_points;
		        }
		        public String getFPRD_Swap_Points() {
		        return FPRD_Swap_Points;
		        }
		        public void setFPRD_Swap_Points(String fprd_swap_points) {
		         FPRD_Swap_Points  =  fprd_swap_points;
		        }
		        public String getFPRD_Bid_Swap_Points() {
		        return FPRD_Bid_Swap_Points;
		        }
		        public void setFPRD_Bid_Swap_Points(String fprd_bid_swap_points) {
		         FPRD_Bid_Swap_Points  =  fprd_bid_swap_points;
		        }
		        public String getFPRD_Offer_Swap_Points() {
		        return FPRD_Offer_Swap_Points;
		        }
		        public void setFPRD_Offer_Swap_Points(String fprd_offer_swap_points) {
		         FPRD_Offer_Swap_Points  =  fprd_offer_swap_points;
		        }
		        public String getFPRD_Trade_Date() {
		        return FPRD_Trade_Date;
		        }
		        public void setFPRD_Trade_Date(String fprd_trade_date) {
		         FPRD_Trade_Date  =  fprd_trade_date;
		        }
		        public String getFPRD_Value_Date() {
		        return FPRD_Value_Date;
		        }
		        public void setFPRD_Value_Date(String fprd_value_date) {
		         FPRD_Value_Date  =  fprd_value_date;
		        }
		        public String getFPRD_Fixing_Date() {
		        return FPRD_Fixing_Date;
		        }
		        public void setFPRD_Fixing_Date(String fprd_fixing_date) {
		         FPRD_Fixing_Date  =  fprd_fixing_date;
		        }
		        public String getFPRD_Maturity_Date() {
		        return FPRD_Maturity_Date;
		        }
		        public void setFPRD_Maturity_Date(String fprd_maturity_date) {
		         FPRD_Maturity_Date  =  fprd_maturity_date;
		        }
		        public String getFPRD_Quote_State() {
		        return FPRD_Quote_State;
		        }
		        public void setFPRD_Quote_State(String fprd_quote_state) {
		         FPRD_Quote_State  =  fprd_quote_state;
		        }
		        public String getFPRD_Order_Price() {
		        return FPRD_Order_Price;
		        }
		        public void setFPRD_Order_Price(String fprd_order_price) {
		         FPRD_Order_Price  =  fprd_order_price;
		        }
		        public String getFPRD_Order_Fill_Amount() {
		        return FPRD_Order_Fill_Amount;
		        }
		        public void setFPRD_Order_Fill_Amount(String fprd_order_fill_amount) {
		         FPRD_Order_Fill_Amount  =  fprd_order_fill_amount;
		        }
		        public String getFPRD_Last_Spot_Rate() {
		        return FPRD_Last_Spot_Rate;
		        }
		        public void setFPRD_Last_Spot_Rate(String fprd_last_spot_rate) {
		         FPRD_Last_Spot_Rate  =  fprd_last_spot_rate;
		        }
		        public String getFPRD_Last_Fwd_Points() {
		        return FPRD_Last_Fwd_Points;
		        }
		        public void setFPRD_Last_Fwd_Points(String fprd_last_fwd_points) {
		         FPRD_Last_Fwd_Points  =  fprd_last_fwd_points;
		        }
		        public String getFPRD_Order_Pending_Qty() {
		        return FPRD_Order_Pending_Qty;
		        }
		        public void setFPRD_Order_Pending_Qty(String fprd_order_pending_qty) {
		         FPRD_Order_Pending_Qty  =  fprd_order_pending_qty;
		        }
		        public String getFPRD_Order_Settlement_Date() {
		        return FPRD_Order_Settlement_Date;
		        }
		        public void setFPRD_Order_Settlement_Date(String fprd_order_settlement_date) {
		         FPRD_Order_Settlement_Date  =  fprd_order_settlement_date;
		        }
		        public String getFPRD_Order_All_In_Rate() {
		        return FPRD_Order_All_In_Rate;
		        }
		        public void setFPRD_Order_All_In_Rate(String fprd_order_all_in_rate) {
		         FPRD_Order_All_In_Rate  =  fprd_order_all_in_rate;
		        }
		        public String getFPRD_Order_Fill_Qty() {
		        return FPRD_Order_Fill_Qty;
		        }
		        public void setFPRD_Order_Fill_Qty(String fprd_order_fill_qty) {
		         FPRD_Order_Fill_Qty  =  fprd_order_fill_qty;
		        }
		        public String getFPRD_Order_Average_price() {
		        return FPRD_Order_Average_price;
		        }
		        public void setFPRD_Order_Average_price(String fprd_order_average_price) {
		         FPRD_Order_Average_price  =  fprd_order_average_price;
		        }
		        public String getFPRD_Last_Price() {
		        return FPRD_Last_Price;
		        }
		        public void setFPRD_Last_Price(String fprd_last_price) {
		         FPRD_Last_Price  =  fprd_last_price;
		        }
		        public String getFPRD_Order_Min_Qty() {
		        return FPRD_Order_Min_Qty;
		        }
		        public void setFPRD_Order_Min_Qty(String fprd_order_min_qty) {
		         FPRD_Order_Min_Qty  =  fprd_order_min_qty;
		        }
		        public String getFPRD_Order_Settlement_Date2() {
		        return FPRD_Order_Settlement_Date2;
		        }
		        public void setFPRD_Order_Settlement_Date2(String fprd_order_settlement_date2) {
		         FPRD_Order_Settlement_Date2  =  fprd_order_settlement_date2;
		        }
		        public String getFPRD_Order_All_In_Rate2() {
		        return FPRD_Order_All_In_Rate2;
		        }
		        public void setFPRD_Order_All_In_Rate2(String fprd_order_all_in_rate2) {
		         FPRD_Order_All_In_Rate2  =  fprd_order_all_in_rate2;
		        }
		        public String getFPRD_Order_Fill_Qty2() {
		        return FPRD_Order_Fill_Qty2;
		        }
		        public void setFPRD_Order_Fill_Qty2(String fprd_order_fill_qty2) {
		         FPRD_Order_Fill_Qty2  =  fprd_order_fill_qty2;
		        }
		        public String getFPRD_Order_Avarage_Price2() {
		        return FPRD_Order_Avarage_Price2;
		        }
		        public void setFPRD_Order_Avarage_Price2(String fprd_order_avarage_price2) {
		         FPRD_Order_Avarage_Price2  =  fprd_order_avarage_price2;
		        }
		        public String getFPRD_Last_Price2() {
		        return FPRD_Last_Price2;
		        }
		        public void setFPRD_Last_Price2(String fprd_last_price2) {
		         FPRD_Last_Price2  =  fprd_last_price2;
		        }
		        public String getFPRD_Order_Min_Qty2() {
		        return FPRD_Order_Min_Qty2;
		        }
		        public void setFPRD_Order_Min_Qty2(String fprd_order_min_qty2) {
		         FPRD_Order_Min_Qty2  =  fprd_order_min_qty2;
		        }
		        public String getFPRD_Trade_Exec_Type() {
		        return FPRD_Trade_Exec_Type;
		        }
		        public void setFPRD_Trade_Exec_Type(String fprd_trade_exec_type) {
		         FPRD_Trade_Exec_Type  =  fprd_trade_exec_type;
		        }
		        public String getFPRD_Trade_Order_Status() {
		        return FPRD_Trade_Order_Status;
		        }
		        public void setFPRD_Trade_Order_Status(String fprd_trade_order_status) {
		         FPRD_Trade_Order_Status  =  fprd_trade_order_status;
		        }
		        public String getFPRD_Trade_Book_Status() {
		        return FPRD_Trade_Book_Status;
		        }
		        public void setFPRD_Trade_Book_Status(String fprd_trade_book_status) {
		         FPRD_Trade_Book_Status  =  fprd_trade_book_status;
		        }
		        public String getFPRD_Quote_Ack_Status() {
		        return FPRD_Quote_Ack_Status;
		        }
		        public void setFPRD_Quote_Ack_Status(String fprd_quote_ack_status) {
		         FPRD_Quote_Ack_Status  =  fprd_quote_ack_status;
		        }
		        public String getFPRD_Quote_Request_Rejection_Reason() {
		        return FPRD_Quote_Request_Rejection_Reason;
		        }
		        public void setFPRD_Quote_Request_Rejection_Reason(String fprd_quote_request_rejection_reason) {
		         FPRD_Quote_Request_Rejection_Reason  =  fprd_quote_request_rejection_reason;
		        }
		        public String getFPRD_Quote_Rejection_Reason() {
		        return FPRD_Quote_Rejection_Reason;
		        }
		        public void setFPRD_Quote_Rejection_Reason(String fprd_quote_rejection_reason) {
		         FPRD_Quote_Rejection_Reason  =  fprd_quote_rejection_reason;
		        }
		        public String getFPRD_Quote_Cancel_Type() {
		        return FPRD_Quote_Cancel_Type;
		        }
		        public void setFPRD_Quote_Cancel_Type(String fprd_quote_cancel_type) {
		         FPRD_Quote_Cancel_Type  =  fprd_quote_cancel_type;
		        }
		        public String getFPRD_Quote_Cancel_Level() {
		        return FPRD_Quote_Cancel_Level;
		        }
		        public void setFPRD_Quote_Cancel_Level(String fprd_quote_cancel_level) {
		         FPRD_Quote_Cancel_Level  =  fprd_quote_cancel_level;
		        }
		        public String getFPRD_Quote_Request_YN() {
		        return FPRD_Quote_Request_YN;
		        }
		        public void setFPRD_Quote_Request_YN(String fprd_quote_request_yn) {
		         FPRD_Quote_Request_YN  =  fprd_quote_request_yn;
		        }
		        public String getFPRD_Quote_Request_At() {
		        return FPRD_Quote_Request_At;
		        }
		        public void setFPRD_Quote_Request_At(String fprd_quote_request_at) {
		         FPRD_Quote_Request_At  =  fprd_quote_request_at;
		        }
		        public String getFPRD_Quote_Request_By() {
		        return FPRD_Quote_Request_By;
		        }
		        public void setFPRD_Quote_Request_By(String fprd_quote_request_by) {
		         FPRD_Quote_Request_By  =  fprd_quote_request_by;
		        }
		        public String getFPRD_Quote_Response_YN() {
		        return FPRD_Quote_Response_YN;
		        }
		        public void setFPRD_Quote_Response_YN(String fprd_quote_response_yn) {
		         FPRD_Quote_Response_YN  =  fprd_quote_response_yn;
		        }
		        public String getFPRD_Quote_Response_At() {
		        return FPRD_Quote_Response_At;
		        }
		        public void setFPRD_Quote_Response_At(String fprd_quote_response_at) {
		         FPRD_Quote_Response_At  =  fprd_quote_response_at;
		        }
		        public String getFPRD_Quote_Response_By() {
		        return FPRD_Quote_Response_By;
		        }
		        public void setFPRD_Quote_Response_By(String fprd_quote_response_by) {
		         FPRD_Quote_Response_By  =  fprd_quote_response_by;
		        }
		        public String getFPRD_Acknowledged_At() {
		        return FPRD_Acknowledged_At;
		        }
		        public void setFPRD_Acknowledged_At(String fprd_acknowledged_at) {
		         FPRD_Acknowledged_At  =  fprd_acknowledged_at;
		        }
		        public String getFPRD_Acknowledged_By() {
		        return FPRD_Acknowledged_By;
		        }
		        public void setFPRD_Acknowledged_By(String fprd_acknowledged_by) {
		         FPRD_Acknowledged_By  =  fprd_acknowledged_by;
		        }
		        public String getFPRD_Cancelled_At() {
		        return FPRD_Cancelled_At;
		        }
		        public void setFPRD_Cancelled_At(String fprd_cancelled_at) {
		         FPRD_Cancelled_At  =  fprd_cancelled_at;
		        }
		        public String getFPRD_Cancelled_By() {
		        return FPRD_Cancelled_By;
		        }
		        public void setFPRD_Cancelled_By(String fprd_cancelled_by) {
		         FPRD_Cancelled_By  =  fprd_cancelled_by;
		        }
		        public String getFPRD_Trade_Proceed_YN() {
		        return FPRD_Trade_Proceed_YN;
		        }
		        public void setFPRD_Trade_Proceed_YN(String fprd_trade_proceed_yn) {
		         FPRD_Trade_Proceed_YN  =  fprd_trade_proceed_yn;
		        }
		        public String getFPRD_Trade_Proceed_At() {
		        return FPRD_Trade_Proceed_At;
		        }
		        public void setFPRD_Trade_Proceed_At(String fprd_trade_proceed_at) {
		         FPRD_Trade_Proceed_At  =  fprd_trade_proceed_at;
		        }
		        public String getFPRD_Trade_Proceed_By() {
		        return FPRD_Trade_Proceed_By;
		        }
		        public void setFPRD_Trade_Proceed_By(String fprd_trade_proceed_by) {
		         FPRD_Trade_Proceed_By  =  fprd_trade_proceed_by;
		        }
		        public String getFPRD_Order_Requested_YN() {
		        return FPRD_Order_Requested_YN;
		        }
		        public void setFPRD_Order_Requested_YN(String fprd_order_requested_yn) {
		         FPRD_Order_Requested_YN  =  fprd_order_requested_yn;
		        }
				public String getFPRD_Order_Requested_At() {
					return FPRD_Order_Requested_At;
				}
				public void setFPRD_Order_Requested_At(String fPRD_Order_Requested_At) {
					FPRD_Order_Requested_At = fPRD_Order_Requested_At;
				}
				public String getFPRD_Order_Requested_By() {
					return FPRD_Order_Requested_By;
				}
				public void setFPRD_Order_Requested_By(String fPRD_Order_Requested_By) {
					FPRD_Order_Requested_By = fPRD_Order_Requested_By;
				}
				public String getFPRD_Order_Response_At() {
					return FPRD_Order_Response_At;
				}
				public void setFPRD_Order_Response_At(String fPRD_Order_Response_At) {
					FPRD_Order_Response_At = fPRD_Order_Response_At;
				}
				public String getFPRD_Order_Response_By() {
					return FPRD_Order_Response_By;
				}
				public void setFPRD_Order_Response_By(String fPRD_Order_Response_By) {
					FPRD_Order_Response_By = fPRD_Order_Response_By;
				}
				public String getFPRD_Created_At() {
					return FPRD_Created_At;
				}
				public void setFPRD_Created_At(String fPRD_Created_At) {
					FPRD_Created_At = fPRD_Created_At;
				}
				public String getFPRD_Created_By() {
					return FPRD_Created_By;
				}
				public void setFPRD_Created_By(String fPRD_Created_By) {
					FPRD_Created_By = fPRD_Created_By;
				}
				public String getFPRD_Updated_By() {
					return FPRD_Updated_By;
				}
				public void setFPRD_Updated_By(String fPRD_Updated_By) {
					FPRD_Updated_By = fPRD_Updated_By;
				}
				public String getFPRD_Updated_At() {
					return FPRD_Updated_At;
				}
				public void setFPRD_Updated_At(String fPRD_Updated_At) {
					FPRD_Updated_At = fPRD_Updated_At;
				}
				public String getFPRD_Ccy1_Amt() {
					return FPRD_Ccy1_Amt;
				}
				public void setFPRD_Ccy1_Amt(String fPRD_Ccy1_Amt) {
					FPRD_Ccy1_Amt = fPRD_Ccy1_Amt;
				}
				public String getFPRD_Ccy2_Amt() {
					return FPRD_Ccy2_Amt;
				}
				public void setFPRD_Ccy2_Amt(String fPRD_Ccy2_Amt) {
					FPRD_Ccy2_Amt = fPRD_Ccy2_Amt;
				}
		
		       
		    }

}
