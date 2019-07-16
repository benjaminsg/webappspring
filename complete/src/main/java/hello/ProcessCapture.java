package hello;
//package com.cnp.sdk.samples;

import java.io.StringWriter;
import java.util.Properties;
import javax.xml.bind.*;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXB;

import com.cnp.sdk.*;
import com.cnp.sdk.generate.*;

public class ProcessCapture {
    private static CnpOnline cnp;
    private String xmlResponse;

    public void configure(Greeting g) {
        Properties config = new Properties();
        config.setProperty("url", g.getUrl());
        if (g.getProxyHost() != null) {
            config.setProperty("proxyHost", g.getProxyHost());
        }
        if (g.getProxyPort() != null) {
            config.setProperty("proxyPort", g.getProxyPort());
        }
        config.setProperty("username", g.getUser());
        config.setProperty("password", g.getPassword());
        config.setProperty("merchantId", g.getMerchantId());
        // config.setProperty("printxml", "true");
        cnp = new CnpOnline(config);
    }

    // // @BeforeClass
    // public static void beforeClass() throws Exception {
    // cnp = new CnpOnline();
    // }

    public CaptureResponse simpleCapture(Greeting g) {
        Capture capture = new Capture();

        capture.setCnpTxnId(Long.parseLong(g.getCnpTxnId()));
        capture.setAmount(Long.parseLong(g.getCaptureAmount()));
        capture.setPayPalNotes(g.getPaypalNotes());
        capture.setId(g.getCaptureId());
        capture.setReportGroup("Default Report Group");

        CaptureResponse response = cnp.capture(capture);
        StringWriter sw = new StringWriter();
        JAXB.marshal(response, sw);
        xmlResponse = sw.toString();
        return response;
    }

    public String toString() {
        return this.xmlResponse;
    }

    public String getXmlResponse() {
        return this.xmlResponse;
    }

    public void setXmlResponse(String xmlResponse) {
        this.xmlResponse = xmlResponse;
    }

}

// instantiate a cnpOnline object using new cnpOnline(config)
// after that do the capture