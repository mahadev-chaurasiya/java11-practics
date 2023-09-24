package com.md.generics.app6;

public class CustomArray<E> {
    private E[] array;
    private int position = 0;

    @SuppressWarnings("uncheckd")
    public CustomArray(int size) {
        array = (E[]) new Object[size];
    }

    public void add(E e) {
        if (position == array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[position++] = e;
    }

    public E getArray(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (var obj : array) {
            stringBuilder.append(obj.toString());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public int size(){
        return position;
    }
}
