package com.lzy.commonTest;

import com.lizy.entity.User;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.String;
/**
 * Created By Lizhengyuan on 18-8-31
 */
public class Collection{

    public static void main(String[] args) {
        List<User> list = new ArrayList();
        List<User> list1 = new ArrayList<>();
        list.add(new User(3424, "sef", "ssfe"));
        list.add(new User(1232, "sef", "ssfe"));
        list.add(new User(234, "sef", "ssfe"));
        list.add(new User(34545456, "sef", "ssfe"));
        // .stream().sorted(Comparator.comparing(GameChipConfigPo::getChip)).collect(Collectors.toList()).subList(0,num);
       // list1 = list.stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
        //System.out.println(list1);

        System.out.println(list);

        Map<String, Object> params = new HashMap<>();
        params.put("fse", "lizy");
        params.get("lizy");
        params.put(null,1232);

        params.remove("lizy");
        params.remove(null);

        list.parallelStream().forEach(e->{
            System.out.println(e);
        });
    }

    @Test
    public void test(){
        Map<String, Object> map = new HashMap<>();
        map.put("", BigDecimal.ZERO);
        System.out.println(map.hashCode());
    }

}
