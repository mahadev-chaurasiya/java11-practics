package com.md.stream;

import java.util.List;
import java.util.stream.Stream;
class Alphabate{
    String name;
    public Alphabate(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Alphabate{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class D {
    public static void main(String[] args){
        var names = List.of("Apple","Ball","Cat","Dog","Elephant","Fish","Gun","Ink");
        names.stream()
                .map(Alphabate::new)
                .forEach(System.out::println);
    }
}
