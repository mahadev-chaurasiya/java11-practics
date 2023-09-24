package com.md.generics.app6;

public class Mammals extends Creature{
    private String name;

    public Mammals(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void feed(){
        System.out.println(name+" feeding");
    }
}
