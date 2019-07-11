package hello;

public class Greeting {

    // config variables
    private String content;
    private String url;
    private String proxy;
    private String user;
    private String password;
    private String merchantId;

    // simple auth variables
    private String AuthReportGroup;
    private String orderId;
    private Long authAmount;
    private String authOrderSource;
    private String authId;
    private String cardNumber;
    private String expirationDate;
    private String cardType;

    // simple capture variables
    private String captureReportGroup;
    private String cnpTxnId;
    private Long captureAmount;
    private String paypalNotes;
    private String captureOrderSource;
    private String pin;
    private String captureId;

    // config settings getters and setters
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProxy() {
        return this.proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    // simpleAuth variable getters and setters
}
