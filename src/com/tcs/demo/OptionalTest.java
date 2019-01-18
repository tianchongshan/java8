package com.tcs.demo;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        //参数不能是null
        Optional<Integer> optional1=Optional.of(222);
        //参数可以是null获非null
        //将所有null包装成Optional对象
        Optional<Integer> optional2=Optional.ofNullable(null);
        Object o1=Optional.<Integer>empty();
        Object o2=Optional.<String>empty();
        System.out.println(optional1);

        System.out.println(optional1.isPresent()==true);
        System.out.println(optional2.isPresent()==false);

        //如果optional对象保存的值不是null，则返回原来的值，否则返回value
        System.out.println(optional1.orElse(1000));
        System.out.println(optional2.orElse(1000));
        System.out.println(optional2.orElseGet(()->{
            return 100;
        }));

        Optional<String> str1Optional=optional1.map((a)->"key"+a);
        System.out.println(str1Optional.get());

        Optional<String> str2Optional=optional1.flatMap((a)->{
            return Optional.<String>of("key"+a);
        });
        System.out.println(str2Optional.get());

    }
}
