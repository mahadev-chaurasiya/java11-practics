package com.md.binarysystem;

public class A {
    public static void main(String[] args){
        String value = toBinary(101);
        int val1 = 0b101010011;
        int val2 = 0b11010110;
        //int res ult = val1 | val2;
        int result = val1 ^ val2;
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(result);
    }
    private static String toBinary(int val){
        return String.format("%8s", Integer.toBinaryString(val).replace(" ","0"));
    }
}
