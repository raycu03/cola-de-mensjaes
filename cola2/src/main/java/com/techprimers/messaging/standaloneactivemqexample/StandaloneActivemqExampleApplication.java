package com.techprimers.messaging.standaloneactivemqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

@SpringBootApplication
public class StandaloneActivemqExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneActivemqExampleApplication.class, args);
	}

}
