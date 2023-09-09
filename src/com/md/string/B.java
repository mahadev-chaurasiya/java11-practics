package com.md.string;

import java.util.stream.IntStream;

public class B {
    public static void main(String[] args){
        int[] num = new int[3];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        IntStream.range(0, num.length).forEach(i->{
            System.out.println(num[i]);
        });
    }
}
