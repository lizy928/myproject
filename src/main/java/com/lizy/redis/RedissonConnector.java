package com.lizy.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created By Lizhengyuan on 19-2-15
 */
@Component
public class RedissonConnector {

    /*@Value("spring.redis.host")
    private String redisHost;*/

    RedissonClient redisson;
    @PostConstruct
    public void init(){
        Config config = new Config();
        config.useSingleServer().setAddress("47.107.92.79:6379");
        redisson = Redisson.create(config);
    }

    public RedissonClient getClient(){
        return redisson;
    }

}

