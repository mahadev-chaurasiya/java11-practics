package com.md.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class IncrementMap extends TreeMap<String, Integer> {
    public void putOrAdd(String key, Integer value) {
        Integer count = get(key);
        if (count == null) {
            put(key, value);
        } else {
            put(key, value + count);
        }
    }
}

public class M2 {
    public static void main(String[] args) throws IOException {
        var words = Files.lines(Paths.get("/Users/mahadev.chaurasiya/backend/java11/src/hello2.txt"))
                .map(s -> s.split("[^a-zA-z]"))
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                .collect(
                        IncrementMap::new,
                        M2::accumulate,
                        M2::combine);
        System.out.println(words);
        words.forEach((word, count) -> {
            System.out.println(word + " " + count);
        });
    }

    private static void accumulate(IncrementMap map, String word) {
        // Integer count = map.get(word);
        map.putOrAdd(word, 1);
    }

    private static void combine(IncrementMap map1, IncrementMap map2) {
        map2.forEach((word, count2) ->{
            map1.putOrAdd(word, count2);
        });
    }
}
