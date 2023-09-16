package com.md.stream;

import java.util.stream.IntStream;

public class I {
    public static void main(String[] args){
        System.out.println(IntStream.range(0,5).sum());
        var value = IntStream.range(0,5).reduce(0,(sumTotal, item)->{
            System.out.println(sumTotal+ " : "+item);
            return sumTotal+item;
        });
        System.out.println(value);
    }
}
