package com.md.stream;

import java.util.stream.Stream;

public class C {
    public static void main(String[] args){
        Stream.of(1,2,3,4,5).forEach(System.out::println);
        Stream.generate(()->"Mahadev Chaurasiya").limit(3).forEach(System.out::println);
    }
}
