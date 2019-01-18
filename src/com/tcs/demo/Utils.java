package com.tcs.demo;

import java.util.List;
import java.util.function.Predicate;

public  class Utils<T>{
    public static <E> void eval(List<E> list, Predicate<E> predicate) {
        for(E n:list){
            if(predicate.test(n)){
                System.out.print(n+" ");
            }
        }
        System.out.println("");
    }
}
