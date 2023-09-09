package com.md.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class B {
    public static void main(String[] args){
        try {
            Files.lines(Paths.get("abc.txt")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
