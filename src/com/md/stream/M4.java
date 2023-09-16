package com.md.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class M4 {
    public static void main(String[] args) throws IOException {
        // groupingBy
        var words = Files.lines(Paths.get("/Users/mahadev.chaurasiya/backend/java11/src/hello2.txt"))
                .map(s -> s.split("[^a-zA-z]"))
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                //.collect(Collectors.groupingBy(word -> word.substring(0,1), Collectors.toList()));
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        var wordsList = words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((v1, v2) -> v2.compareTo(v1)))
                .collect(Collectors.toList());

        for (int i = 0; i < wordsList.size(); i++) {
            if (i % 7 == 0) {
                System.out.println();
            }
            var entry = wordsList.get(i);
            System.out.printf("%15s : %-5d", entry.getKey(), entry.getValue());
        }
    }
}
