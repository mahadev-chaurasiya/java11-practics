package com.md.generics.app2;

public class Wrapper<E> {
    private E object;

    public void setObject(E object) {
        this.object = object;
    }

    public E getObject() {
        return object;
    }
}
