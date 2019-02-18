package com.lzy.commonTest;

import com.lizy.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created By Lizhengyuan on 18-10-9
 */
public class Common {

    /*public static void main(String[] args) {

        Long a =1537501929000L;
        Timestamp timestamp = new Timestamp(a);
        System.out.println(timestamp);

    }*/
    @Test
    public void test(){
        List<User>  list = new ArrayList<>();
        list.forEach(e->{
            System.out.println(e.getId());
        });
        for(User user : list){
            System.out.println(user.getId());
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getId());
        }
    }

    @Test
    public void test2(){

        List<Integer> list = new ArrayList();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(5);
        int sum = list.stream().mapToInt(e -> e).sum();
        list.forEach(e->{
            String a = String.format("%.2f", e * 1.0 / sum * 100);
            String b = a.split("\\.")[1];
            int intNum = Integer.valueOf(a.split("\\.")[0]);
                    String dotstr = b.substring(0,1);
            int dot = Integer.valueOf(dotstr);
            if(Integer.valueOf(b.substring(1)) >= 5){
                dot = dot+1;
            }
            if(dot >= 5){
                intNum = intNum+1;
            }
           System.out.println(e +"------"+ intNum);
        });
    }

    @Test
    public void test3(){
        int list[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        for(int i=0;i<list.length;i++){
            int sum = 0;
            for(int j=0;j<list[i].length;sum+=list[i][j],j++);
            System.out.println(sum+"\n");
        }
    }

    @Test
    public void test4(){
        List<Integer> list = new ArrayList();
        list.add(315);
        list.add(82000);
        list.add(300);
        list.add(866);
        list.add(300);
        list.add(1002);
        int sum = list.stream().mapToInt(e -> e).sum();
        long count = 0;
        for(int i  = 0, size = list.size(); i < list.size(); i++){
            double tempresult= (list.get(i)*1.0/sum*100);
            long round = Math.round(tempresult);
            count += round;
            System.out.println(round);
            if(i == size-1){
                int tem = (int) (100 - count);
                System.out.println(count+"---"+tem);
                System.out.println((int)round + tem);
            }
        }
    }

    @Test
    public void test5(){
        double a = 1.26;
        int b= 2;
        System.out.println(a*b);

    }
    @Test
    public void test6(){
        String orderInfo = "2142018091000271#001|1~1.58~20";
        BigDecimal bonusAmount = BigDecimal.ZERO;
        if(!orderInfo.isEmpty()){
            String[] betInfo = orderInfo.split("~");
            double odds = Double.parseDouble(betInfo[1]);
            int betAmount = Integer.valueOf(betInfo[2]);
            double bonus = odds * betAmount;
            bonusAmount = BigDecimal.valueOf(Math.round(bonus));
        }
        System.out.println(bonusAmount);
    }

    @Test
    public void test7(){
        double a = 100.3243;
        double b = 200.324;
        System.out.println(a/b);
        int value = BigDecimal.valueOf(Double.valueOf("123.00")).intValue();
        System.out.println(value);
        BigDecimal ab = BigDecimal.valueOf(a);

        int i = Double.valueOf(String.valueOf(ab)).intValue();
        System.out.println(i);
    }

    @Test
    public void test8(){
        List<Integer> list = new ArrayList<>();
        list.add(315);
        list.add(82000);
        list.add(300);
        list.add(866);
        list.add(300);
        list.add(1002);

        Map<String, Integer> map = new HashMap();
        list.forEach(e-> map.put(""+e,e));
        System.out.println(map);
    }

    /**
     * 正则表达式
     */
    @Test
    public void test9(){
        String str = "130169396090";
        Boolean result = false;
        Pattern pattern = Pattern.compile("[0-9]*");
        if (pattern.matcher(str).matches() && (str.length() == 10 || str.length() == 12) && str.startsWith("1")) {
            result = true;
        }
        System.out.println(result);
    }

    @Test
    public void test10(){
        String mobile = "123123";
        String verifyCode = "";
        String password = "123456";
        if((StringUtils.isEmpty(mobile) && StringUtils.isEmpty(verifyCode)) || (StringUtils.isEmpty(mobile) && StringUtils.isNotEmpty(verifyCode)) ||
                (StringUtils.isEmpty(verifyCode) && StringUtils.isNotEmpty(mobile)) || StringUtils.isEmpty(password)
                ){
            System.out.println("参数异常");
        }
        if(StringUtils.isEmpty(verifyCode) && StringUtils.isEmpty(password)){
            System.out.println("参数异常２");
        }

    }

    @Test
    public void test11(){
        Date fromDate = new Date();
        Date toDate = new Date();
        Map params = new HashMap();
        params.put("fromDate", fromDate + " 00:00:00");
        params.put("toDate", toDate.toString() + " 59:59:59");
        System.out.println(params);
    }

}
