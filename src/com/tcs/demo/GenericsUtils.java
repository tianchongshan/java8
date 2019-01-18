package com.tcs.demo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericsUtils {
    public static Class getSuperClassGenricType(Class clazz,int index){
        Type genType=clazz.getGenericSuperclass();
        if(!(genType instanceof ParameterizedType)){
            return Object.class;
        }
        Type[] params=((ParameterizedType)genType).getActualTypeArguments();
        if(index>=params.length||index<0){
            throw new RuntimeException("你输入的索引"+(index<0?"不能小于0":"超出了参数的总数"));
        }
        if(!(params[index] instanceof Class)){
            return Object.class;
        }
        return (Class) params[index];

    }
}
