package com.techprimers.messaging.cola2.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;
import javax.jms.Topic;

@RestController
@RequestMapping("/")
public class ProducerResource {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @Autowired
    Topic topic;

    @GetMapping("/{message}")
   public String publish(@PathVariable("message") final String message) {

       jmsTemplate.convertAndSend(queue, message);

        return "Published Successfully";
    }

    @PostMapping("/")
    public String user(@RequestBody String user){
        jmsTemplate.convertAndSend(topic,user);
        return "exito";
    }

}
