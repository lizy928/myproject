package com.lzy.commonTest;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.lang.String;

/**
 * Created By Lizhengyuan on 18-9-7
 */
//Stream
public class java8demo05 {

    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.print(squaresList);

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
        System.out.print(count);

        random.ints().limit(10).sorted().forEach(System.out::println);

        List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        int count2 = (int) strings2.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.print(count2);

        List<String> strings3 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings3.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.print(filtered);


        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);

        System.out.print("___________________________________________");

        List<Integer> numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers2.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }
}
