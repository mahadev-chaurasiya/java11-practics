package com.md;

public class FactorialRecursive {
    public static void main(String[] args){

        System.out.println(factorial(4));
    }
    private static int factorial(int val){
        if (val == 0){
            return 1;
        }
        return val *factorial(val -1);
    }
}
