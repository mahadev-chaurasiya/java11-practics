package com.md.string;

import java.util.stream.IntStream;

public class A {
    public static void main(String[] args){
        String[] nameList = {"A", "B","C","D","E","F"};
        IntStream.range(0,nameList.length).forEach(i->{
            System.out.println(i+". "+nameList[i]);
        });
    }
}
