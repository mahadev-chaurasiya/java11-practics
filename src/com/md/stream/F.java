package com.md.stream;

import java.util.List;
import java.util.stream.Collectors;

class Player{
    private String name;
    public Player(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class F {
    public static void main(String[] args){
        var names = List.of("Sachin","Dhoni","Kohali","Shekhar","Rohit");
       var list = names.stream()
               .peek(s->System.out.println(s))
               .map(Player::new)
               .count();
       System.out.println(list);
    }
}
