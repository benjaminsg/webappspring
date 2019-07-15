package hello;
//package com.cnp.sdk.samples;

import java.util.Properties;

import com.cnp.sdk.*;
import com.cnp.sdk.generate.*;

public class ProcessCapture {
    private static CnpOnline cnp;

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

        CaptureResponse response = cnp.capture(capture);
        // assertEquals("Approved", response.getMessage());
        return response;
    }
}

// instantiate a cnpOnline object using new cnpOnline(config)
// after that do the capture