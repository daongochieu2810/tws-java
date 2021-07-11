package twsjava.lib.client;

public class NewsProvider {
    private String 	m_providerCode;
    private String 	m_providerName;

    // Get
    public String providerCode() { return m_providerCode; }
    public String providerName() { return m_providerName; }

    // Set
    public void providerCode(String providerCode) { m_providerCode = providerCode; }
    public void providerName(String providerName) { m_providerName = providerName; }

    public NewsProvider() {
    }

    public NewsProvider(String p_providerCode, String p_providerName) {
        m_providerCode = p_providerCode;
        m_providerName = p_providerName;
    }
}
