package com.lzy.commonTest;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;

/**
 * Created By Lizhengyuan on 19-2-12
 */
public class RedisTest {

    @Test
    public void test(){
      HashSet<HostAndPort> nodes = new HashSet<HostAndPort>();
        nodes.add(new HostAndPort("47.107.92.79",7001));
        nodes.add(new HostAndPort("47.107.92.79",7002));
        nodes.add(new HostAndPort("47.107.92.79",7003));
        nodes.add(new HostAndPort("47.107.92.79",7004));
        nodes.add(new HostAndPort("47.107.92.79",7005));
        nodes.add(new HostAndPort("47.107.92.79",7006));
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setMaxTotal(3000);
        config.setMaxIdle(300);
        config.setMinIdle(100);
        config.setMaxWaitMillis(2000);//ms
        JedisCluster cluster = new JedisCluster(nodes, 10000, 10000, 3, config);
        String test2 = cluster.get("test2");
        System.out.println(test2);
        try {
            cluster.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
