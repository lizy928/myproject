package com.lizy.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created By Lizhengyuan on 19-2-18
 * 使用AmqpTemplate去发送消息
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("queue","hello,rabbit~");
        System.out.println("has send hello,rabbit");
    }
}
