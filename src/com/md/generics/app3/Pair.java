package com.md.generics.app3;

public class Pair<T, S> {
    private T value1;
    private S value2;

    public Pair(T value1, S value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public S getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return value1.toString() +" "+
                value2.toString();
    }

}
