package twsjava.lib.client;

public class HistoricalTick {
    private long m_time;
    private double m_price;
    private long m_size;

    public HistoricalTick(long time, double price, long size) {
        m_time = time;
        m_price = price;
        m_size = size;
    }

    public long time() {
        return m_time;
    }

    public double price() {
        return m_price;
    }

    public long size() {
        return m_size;
    }
}
