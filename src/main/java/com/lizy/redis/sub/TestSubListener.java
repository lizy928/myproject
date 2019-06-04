package com.lizy.redis.sub;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class TestSubListener implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] bytes) {
        System.out.println(message.getBody());
    }
}
