package com.md.generics.app5;

import com.md.generics.app1.hierarchy.Cat;

public class App5 {
    public static void main(String[] args){

       CustomArray<Cat> array = new CustomArray<>(2);
        array.add(new Cat("Mau 4"));
        array.add(new Cat("Caq"));
        System.out.println(array);
        Cat cat = array.getArray(0);
        Cat cat1 = array.getArray(1);
        System.out.println(cat);
        System.out.println(cat1);
        Cat cat2 = find(array,"Mau");
        System.out.println(cat2);

    }

    private static <T> T find(CustomArray<T> array, String text){
        for (int i = 0; i < array.size(); i++) {
            T value = array.getArray(i);
            if (value.toString().equalsIgnoreCase(text)){
                return value;
            }
        }
        return null;
    }
}
