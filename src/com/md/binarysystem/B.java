package com.md.binarysystem;

public class B {
    public static void main(String[] args){
        int val1 = 0b0010001;
        System.out.println(toBinary(val1));
        int result = val1 << 1 ;
        System.out.println(toBinary(result));

    }

    private static String toBinary(int value){
        return String.format("%s", Integer.toBinaryString(value).replace("", "0"));
    }
}
