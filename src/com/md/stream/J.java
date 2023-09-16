package com.md.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class J {
    public static void main(String[] args){
        var result = Stream.of("hello", "How", "are", "you","?")
                .parallel()
                .reduce("",(p,i)->p+ " "+i, (p1, p2)-> p1+" "+p2);
        System.out.println(result);
    }
}
