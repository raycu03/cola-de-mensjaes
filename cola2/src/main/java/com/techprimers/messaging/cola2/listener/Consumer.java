package com.techprimers.messaging.cola2.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "t1")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }

    @JmsListener(destination = "cada")
    public void consume2(String message) {
        System.out.println("Received Message: " + message);
    }

    @JmsListener(destination = "Test")
    public void consume3(String message) {
        System.out.println("Received Message: " + message);
    }

}
