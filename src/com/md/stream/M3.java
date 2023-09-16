package com.md.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class IncrementMap3 extends TreeMap<String, Integer> {
    public void putOrAdd(String key, Integer value) {
        Integer count = get(key);
        if (count == null) {
            put(key, value);
        } else {
            put(key, value + count);
        }
    }
}

public class M3 {
    public static void main(String[] args) throws IOException {
        var words = Files.lines(Paths.get("/Users/mahadev.chaurasiya/backend/java11/src/hello2.txt"))
                .map(s -> s.split("[^a-zA-z]"))
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                .collect(
                        IncrementMap3::new,
                        M3::accumulate,
                        M3::combine);
        var wordsList = words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((v1, v2)->v2.compareTo(v1)))
                .collect(Collectors.toList());

        for (int i = 0; i < wordsList.size(); i++) {
            if (i%7 == 0){
                System.out.println();
            }
            var entry = wordsList.get(i);
            System.out.printf("%15s : %-5d",entry.getKey(), entry.getValue());
        }
    }

    private static void accumulate(IncrementMap3 map, String word) {
        // Integer count = map.get(word);
        map.putOrAdd(word, 1);
    }

    private static void combine(IncrementMap3 map1, IncrementMap3 map2) {
        map2.forEach((word, count2) ->{
            map1.putOrAdd(word, count2);
        });
    }
}
