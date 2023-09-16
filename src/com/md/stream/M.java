package com.md.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class M {
    public static void main(String[] args) throws IOException {

        var map1 = new HashMap<String, Integer>(Map.of("One", 1, "Two", 2));
        var map2 = new HashMap<String, Integer>(Map.of("One", 1, "Three", 3, "Four", 4));
        combine(map1, map2);
        System.out.println(map1);
        var words = Files.lines(Paths.get("/Users/mahadev.chaurasiya/backend/java11/src/hello2.txt"))
                .map(s -> s.split("[^a-zA-z]"))
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                .collect(TreeMap<String, Integer>::new,
                        (map, word) -> {
                            Integer count = map.get(word);
                            if (count == null) {
                                map.put(word, 1);
                            } else {
                                map.put(word, count + 1);
                            }
                        }, M::combine);
        System.out.println(words);
        words.forEach((word, count) -> {
            System.out.println(word + " " + count);
        });
    }

    private static void combine(Map<String, Integer> map1, Map<String, Integer> map2) {
        map2.forEach((word, count2) -> {
            Integer count1 = map1.get(word);
            if (count1 == null) {
                map1.put(word, count2);
            } else {
                map1.put(word, count1 + count2);
            }
        });

    }
}
