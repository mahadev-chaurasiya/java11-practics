package com.md.generics.app4;

import com.md.generics.app1.hierarchy.Cat;

public class App4 {
    public static void main(String[] args){
        CustomArray<Cat> array = new CustomArray<>(2);
        array.add(new Cat("Mau"));
        array.add(new Cat("Caq"));
        System.out.println(array);
        Cat cat = array.getArray(0);
        Cat cat1 = array.getArray(1);
        System.out.println(cat);
        System.out.println(cat1);
    }
}
