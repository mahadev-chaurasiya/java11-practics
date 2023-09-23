package com.md.generics.app1;

import com.md.generics.app1.hierarchy.Cat;
import com.md.generics.app1.hierarchy.Wrapper;

public class App {
    public static void main(String[] args){
        Wrapper wrapper = new Wrapper();
        Cat cat = new Cat("ABCSS");
        wrapper.setObject(cat);
        Cat cat1 = (Cat)wrapper.getObject();
        System.out.println(cat1);
    }
}
