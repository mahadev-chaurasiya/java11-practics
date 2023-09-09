package com.md.stream;

import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(0,1,2,3,4,5));
        list.stream().forEach(System.out::println);
        list.stream().forEach(info -> {
            System.out.println(info);
        });
    }
}
