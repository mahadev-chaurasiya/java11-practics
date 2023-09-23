package com.md.generics.app3;

import com.md.generics.app1.hierarchy.Cat;

public class App3 {
    public static void main(String[] args){
        Pair<Integer, Cat> pair = new Pair<>(1, new Cat("Mauu"));
         System.out.println(pair);
         System.  out.println(pair.getValue1());
         System.out.println(pair.getValue2() );
    }
}
