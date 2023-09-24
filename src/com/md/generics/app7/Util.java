package com.md.generics.app7;

import com.md.generics.app1.hierarchy.Mammal;
import com.md.generics.app6.CustomArray;

public class Util {
    public static void copy(CustomArray<Mammal> source, CustomArray<Mammal> dest){
        for (int i = 0; i < source.size(); i++) {
            Mammal mammal = source.getArray(i);
            dest.add(mammal);
        }
    }

    public static void copy2(CustomArray<? extends Mammal> source, CustomArray<? super Mammal> dest){
        for (int i = 0; i < source.size(); i++) {
            Mammal mammal = source.getArray(i);
            dest.add(mammal);
        }
    }
}
