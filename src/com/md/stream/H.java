package com.md.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class H {
    public static void main(String[] args) throws IOException {
       /* Files
                .lines(Paths.get("/Users/mahadev.chaurasiya/backend/java11/src/hello2.txt"))
                .map(s->s.split("[^a-zA-Z]"))
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .forEach(System.out::println);*/

      var words = Files
                .lines(Paths.get("/Users/mahadev.chaurasiya/backend/java11/src/hello2.txt"))
                .map(s->s.split("[^a-zA-Z]"))
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
      int count =0;
        for (var word: words) {
            System.out.printf("%-10s",word);
            if (count++ %10==0){
                System.out.println();
            }
        }
    }
}
