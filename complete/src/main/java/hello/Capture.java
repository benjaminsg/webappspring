package hello;
//package com.cnp.sdk.samples;

import com.cnp.sdk.*;
import com.cnp.sdk.generate.*;

public class Capture {
    private static CnpOnline cnp;

    public void configure(Greeting g) {

    }

    // @BeforeClass
    public static void beforeClass() throws Exception {
        cnp = new CnpOnline();
    }

    public void simpleCapture() throws Exception {
        Capture capture = new Capture();
        capture.setCnpTxnId(123456000L);
        capture.setAmount(106L);
        capture.setPayPalNotes("Notes");
        capture.setId("id");

        CaptureResponse response = cnp.capture(capture);
        // assertEquals("Approved", response.getMessage());
    }
}

// instantiate a cnpOnline object using new cnpOnline(config)
// after that do the capture