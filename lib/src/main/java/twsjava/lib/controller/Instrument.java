package twsjava.lib.controller;

public enum Instrument {
    STK("STK"),
    BOND("BOND"),
    EFP("EFP"),
    FUT_EU("FUT.EU"),
    FUT_HK("FUT.HK"),
    FUT_NA("FUT.NA"),
    FUT_US("FUT.US"),
    IND_EU("IND.EU"),
    IND_HK("IND.HK"),
    IND_US("IND.US"),
    PMONITOR("PMONITOR"),
    PMONITORM("PMONITORM"),
    SLB_US("SLB.US"),
    STOCK_EU("STOCK.EU"),
    STOCK_HK("STOCK.HK"),
    STOCK_NA("STOCK.NA"),
    WAR_EU("WAR.EU");

    private final String code;

    Instrument(final String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
