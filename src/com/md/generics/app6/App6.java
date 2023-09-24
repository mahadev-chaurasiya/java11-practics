package com.md.generics.app6;

import com.md.generics.app1.hierarchy.Cat;
import com.md.generics.app1.hierarchy.Mammal;

public class App6 {
    public static void main(String[] args){
        CustomArray<Mammals> array = new CustomArray<>(3 );
        array.add(new Mammals("dolphin"));
        array.add(new Mammals("sheep"));

        CustomArray<Cat> catCustomArray = new CustomArray<>(2);
        catCustomArray.add(new Cat("Mau"));
        catCustomArray.add(new Cat("NAKK"));
        //array.add(new Mammal("cat"));
        //System.out.println(array);
        findAll(array);
       // findAll(catCustomArray);
        addMammal(array);
        findAll(array);
        System.out.println();
        CustomArray<Creature> creatureCustomArray = new CustomArray<>(5);
        creatureCustomArray.add(new Creature("worm"));
        addMammal(creatureCustomArray);
    }
    private static void findAll(CustomArray<? extends Mammals> array){
        for (int i = 0; i < array.size(); i++) {
            Mammals  mammal = array.getArray(i);
            mammal.feed();
        }
    }

    private static void addMammal(CustomArray<? super Mammals> mammal){
        mammal.add(new Mammals("Giraffe"));
    }
}
