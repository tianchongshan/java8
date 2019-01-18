package com.tcs.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,4,5,6,3,8,3);
        System.out.println("输出所有的数据：");
        Utils.eval(list, n->true);
        List<Integer> squaresList=list.stream().map(i->i*i).distinct().collect(Collectors.toList());
        Utils.eval(squaresList,n->true);

        System.out.println("-----------------------------------");

        List<String> strings=Arrays.asList("zabc","efg","","bc","jk");
        List<String> filtered=strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        Utils.eval(filtered,n->true);

        long count=strings.stream().filter(string->string.isEmpty()).count();
        System.out.println(count);
        //流并行处理
        strings.parallelStream().filter(string->!string.isEmpty()).forEach(System.out::println);

        System.out.println("-----------------------------------");

        Random random=new Random();
        random.ints(10,100).limit(5).forEach(System.out::println);
        System.out.println("-----------------------------------");

        random.ints().limit(5).sorted().forEach(System.out::println);
        System.out.println("-----------------------------------");

        List<String> list1=strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选:"+list1);
        String mergeString=strings.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("合并:"+mergeString);
    }



}
