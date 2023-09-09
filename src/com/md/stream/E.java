package com.md.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Color{
    private String name;
    public Color(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String  toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class E {
    public static void main(String[] args){
        var colors = List.of("RED","GREEN","BLUE","YELLOW","BLACK","WHITE");
        System.out.println(colors);
        colors.stream().map(Color::new).forEach(System.out::println);
        var list = colors.stream()
                .map(Color::new)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
