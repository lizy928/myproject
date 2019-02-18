package com.lzy.commonTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.lizy.entity.User;
import com.lizy.entity.User1;
import org.junit.Test;

import java.text.DecimalFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By Lizhengyuan on 18-10-11
 */

public class JsonUtils {

    @Test
    public void test1(){
        User user = new User(1, "lizy" ,"xian");
        User user1 = new User(2, "lizy2", "beijing");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);

        Instant start = Instant.now();
        JSONObject jsonObject = new JSONObject();
        System.out.println(jsonObject.toJSONString(user));
        System.out.println(jsonObject.toJSONString(list));
        Instant stop = Instant.now();
        System.out.println(stop +">>>>"+ start);

        System.out.println(JSONObject.toJSONString(list,true));

        Gson gson = new Gson();
        System.out.println(gson.toJson(user));
        System.out.println(gson.toJson(list));
        System.out.println(JSON.toJSONString(user,true));;
    }

    @Test
    public void test2(){
        User user = new User(1, "lizy" ,"xian");
        User user1 = new User(2, "lizy2", "beijing");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        Instant start = Instant.now();

        Gson gson = new Gson();
        System.out.println(gson.toJson(user));
        System.out.println(gson.toJson(list));
        Instant stop = Instant.now();
        System.out.println(stop +">>>>"+ start);

    }

    @Test
    public void test3(){
        String userJson = "{\"id\":1,\"name\":\"lizy\",\"address\":\"xian\"}";
        Instant start = Instant.now();
        JSONObject jsonObject = (JSONObject) JSONObject.parse(userJson);
        System.out.println(jsonObject.get("id"));
        Instant stop = Instant.now();
        System.out.println(stop +">>>>"+ start);

        System.out.println(JSONObject.parseObject(userJson, User.class));

    }

    @Test
    public void test4(){
        String userJson = "{\"id\":1,\"name\":\"lizy\",\"address\":\"xian\"}";
        Instant start = Instant.now();
        Gson gson = new Gson();
        JsonObject jsonObject = (JsonObject) new JsonParser().parse(userJson);
        System.out.println(jsonObject.get("id").getAsInt());
        Instant stop = Instant.now();
        System.out.println(stop +">>>>"+ start);

        System.out.println(gson.fromJson(userJson,User.class));

        User book = gson.fromJson(userJson, User.class);
        System.out.println(book);

    }

    @Test
    public void test5(){
        String userJson = "[{\"id\":1,\"name\":\"lizy\",\"address\":\"xian\"},{\"id\":2,\"name\":\"lizy2\",\"address\":\"beijing\"}]";
        Gson gson = new Gson();
        List list = gson.fromJson(userJson,new TypeToken<List>() {}.getType());
        System.out.println(list);
    }

    @Test
    public void  test6(){
        String json = "{\"id\":1,\"name\":\"lizy\",\"address\":\"xian\"}";
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(json);
        json = gson.toJson(je);
        System.out.println(json);
    }

    @Test
    public void test7(){
        User1 user = new User1(1,"lizy","lizy", true);
        Gson gson = new Gson();
        System.out.println(gson.toJson(user));
        System.out.println(".............................");
        System.out.println(JSONObject.toJSON(user));
    }

    @Test
    public void test8(){

        String str = "[{\"key\":\"en\",\"keyDesc\":\"英文\",\"value\":\"[\\\"Withdrawable Balance:\\\",\\\"KSh\\\",\\\"Daily maximum withdrawal amount: KSh\\\"]\"}]";
        JSONArray jsonArray = JSONObject.parseArray(str);
        String value = (String) jsonArray.get(0);
        System.out.println(value);
    }

    @Test
    public void test9(){
        double money = 123456789;
        // DecimalFormat的用法 #,###是三位分割一下
        // .00是小数点后保留两位 四舍五入
        DecimalFormat df = new DecimalFormat("#,###.00");
        String m = df.format(money);
        System.out.println(m);
    }

    @Test
    public void test10(){
        int a = 200000;
        DecimalFormat df = new DecimalFormat("#,###");
        String m = df.format(a);
        System.out.println(m);
    }

}
