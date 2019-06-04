package com.lzy.redis;


import com.lizy.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTemplateTest {


    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 使用RedisTemplate访问Redis数据结构
     * https://www.jianshu.com/p/7bf5dc61ca06
     */

    @Test
    public void testString() {
        redisTemplate.opsForValue().set("lizy", "928");
        System.out.println(redisTemplate.opsForValue().get("lizy"));
    }

    @Test
    public void testStringSet() {
        Map<String, Object> params = new HashMap<>();
        params.put("name", "李大神");
        params.put("age", 18);
        redisTemplate.opsForValue().multiSet(params);
        List<String> keys = new ArrayList<>();
        keys.add("name");
        keys.add("age");
        System.out.println(redisTemplate.opsForValue().multiGet(keys));
    }


    @Test
    public void testHash() {

        redisTemplate.opsForHash().put("redisHash", "name", "tom");
        redisTemplate.opsForHash().put("redisHash", "age", 26);
        redisTemplate.opsForHash().put("redisHash", "class", "6");

        Map<String, Object> testMap = new HashMap();
        testMap.put("name", "jack");
        testMap.put("age", 27);
        testMap.put("class", "1");
        redisTemplate.opsForHash().putAll("redisHash1", testMap);

        System.out.println(redisTemplate.opsForHash().get("redisHash", "age"));

        System.out.println(redisTemplate.opsForHash().get("redisHash1", "age"));


        //delete
        System.out.println(redisTemplate.opsForHash().delete("redisHash", "name"));
        System.out.println(redisTemplate.opsForHash().entries("redisHash"));


        //确定哈希hashKey是否存在
        System.out.println(redisTemplate.opsForHash().hasKey("redisHash", "age"));
        System.out.println(redisTemplate.opsForHash().hasKey("redisHash", "ttt"));


    }


    @Test
    public void testSet() {

        //无序集合中添加元素，返回添加个数
        String[] strarrays = new String[]{"strarr1", "sgtarr2"};
        System.out.println(redisTemplate.opsForSet().add("setTest", strarrays));

        //移除并返回集合中的一个随机元素
        System.out.println(redisTemplate.opsForSet().pop("setTest"));
        System.out.println(redisTemplate.opsForSet().members("setTest"));
    }


}
