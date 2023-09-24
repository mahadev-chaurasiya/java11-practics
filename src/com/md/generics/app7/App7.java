package com.md.generics.app7;

import com.md.generics.app1.hierarchy.Mammal;
import com.md.generics.app6.CustomArray;

public class App7 {
    public static void main(String[] args){
        CustomArray<Mammal> source = new CustomArray<>(2);
        source.add(new Mammal("Cat"));
        source.add(new Mammal("Dog"));
        CustomArray<Mammal> dest = new CustomArray<>(2);
        Util.copy(source, dest);
        System.out.println(dest );
        for (int i = 0; i < dest.size(); i++) {
            Mammal mammal = dest.getArray(i);
            System.out.println(mammal);
        }


    }
}
