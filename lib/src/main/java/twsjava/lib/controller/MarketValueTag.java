package twsjava.lib.controller;

import twsjava.lib.client.Types;

public enum MarketValueTag {
    AccountOrGroup("AccountOrGroup"),
    RealCurrency("RealCurrency"),
    IssuerOptionValue("IssuerOption"),
    NetLiquidationByCurrency("Net Liq"),
    CashBalance("CashBalance"),
    TotalCashBalance("TotalCashBalance"),
    AccruedCash("AccruedCash"),
    StockMarketValue("Stocks"),
    OptionMarketValue("Options"),
    FutureOptionValue("Futures"),
    FuturesPNL("FuturesPNL"),
    UnrealizedPnL("UnrealizedPnL"),
    RealizedPnL("RealizedPnL"),
    ExchangeRate("ExchangeRate"),
    FundValue("Fund"),
    NetDividend("NetDividend"),
    MutualFundValue("MutualFund"),
    MoneyMarketFundValue("MoneyMarketFund"),
    CorporateBondValue("CorporateBond"),
    TBondValue("TBond"),
    TBillValue("TBill"),
    WarrantValue("Warrant"),
    FxCashBalance("FxCashBalance");

    private final String description;

    MarketValueTag(final String description) {
        this.description = description;
    }

    public static MarketValueTag get(int i) {
        return Types.getEnum(i, values());
    }

    @Override
    public String toString() {
        return description;
    }
}
