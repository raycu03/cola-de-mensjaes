package com.techprimers.messaging.cola1.listener;

import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techprimers.messaging.cola1.Dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class Consumer {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @JmsListener(destination = "cada")
    public void consume(String message)  {
        System.out.println("Received Message: " + message);
        try {
            ObjectMapper mapper = new ObjectMapper();
            UserDto userDto = mapper.readValue(message, UserDto.class);
            System.out.println(userDto.getCode());
            System.out.println(userDto.getName());
        }catch (IOException e){
            jmsTemplate.convertAndSend(queue, message);
        }

    }

}
