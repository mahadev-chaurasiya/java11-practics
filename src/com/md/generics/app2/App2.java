package com.md.generics.app2;

import com.md.generics.app1.hierarchy.Cat;

public class App2 {
    public static void main(String[] args){
        Wrapper<Cat> wrapper = new Wrapper<>();
        Cat cat = new Cat("Mauuuu");
        wrapper.setObject(cat);
        Cat cat1 = wrapper.getObject();
        System.out.println(cat1);
    }
}
