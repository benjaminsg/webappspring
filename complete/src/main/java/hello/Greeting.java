package hello;

import com.cnp.sdk.*;
import java.util.Properties;
import com.cnp.sdk.generate.*;

public class Greeting {

    // config variables
    private String content;
    private String url;
    private String proxy;
    private String user;
    private String password;
    private String merchantId;

    // simple auth variables
    private String authReportGroup;
    private String orderId;
    private Long authAmount;
    private String authOrderSource;
    private String authId;
    private String cardNumber;
    private String expirationDate;
    private String cardType;

    // simple capture variables
    private String captureReportGroup;
    private Long cnpTxnId;
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
    public String getAuthReportGroup() {
        return this.authReportGroup;
    }

    public void setAuthReportGroup(String authReportGroup) {
        this.authReportGroup = authReportGroup;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getAuthAmount() {
        return this.authAmount;
    }

    public void setAuthAmount(Long authAmount) {
        this.authAmount = authAmount;
    }

    public String getAuthOrderSource() {
        return this.authOrderSource;
    }

    public void setAuthOrderSource(String authOrderSource) {
        this.authOrderSource = authOrderSource;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAuthId() {
        return this.authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    // simple capture variables getters and setters
    public String getCaptureReportGroup() {
        return this.captureReportGroup;
    }

    public void setCaptureReportGroup(String captureReportGroup) {
        this.captureReportGroup = captureReportGroup;
    }

    public Long getCnpTxnId() {
        return this.cnpTxnId;
    }

    public void setCnpTxnId(Long cnpTxnId) {
        this.cnpTxnId = cnpTxnId;
    }

    public Long getCaptureAmount() {
        return this.captureAmount;
    }

    public void setCaptureAmount(Long captureAmount) {
        this.captureAmount = captureAmount;
    }

    public String getPaypalNotes() {
        return this.paypalNotes;
    }

    public void setPaypalNotes(String paypalNotes) {
        this.paypalNotes = paypalNotes;
    }

    public String getCaptureOrderSource() {
        return this.captureOrderSource;
    }

    public void setCaptureOrderSource(String captureOrderSource) {
        this.captureOrderSource = captureOrderSource;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCaptureId() {
        return this.captureId;
    }

    public void setCaptureId(String captureId) {
        this.captureId = captureId;
    }

}
