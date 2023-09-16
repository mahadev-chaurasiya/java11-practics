package com.md.stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class O {
    public static void main(String[] args) {
        var table = IntStream.range(1, 13)
                .mapToObj(n -> IntStream.range(1, 13)
                        .map(k -> k * n)
                        .mapToObj(Integer::toString)
                        .map(s -> String.format("%4s", s))
                        .collect(Collectors.joining())).collect(Collectors.joining("\n"));
        System.out.println(table);
    }
}
