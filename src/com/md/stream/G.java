package com.md.stream;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class G {
    public static void main(String[] args){
        var value = List.of(Set.of(1,2,3),Set.of(4,5,6),Set.of(7,8,9));
        value.forEach(System.out::println);
        value.stream().flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
