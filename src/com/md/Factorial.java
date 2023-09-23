package com.md;

public class Factorial {
    public static void main(String[] args){
        System.out.println(factorial(6));
    }
    private static int factorial(int numb){
        int result = 1;
        for (int i = numb; i >0 ; i--) {
            result *= i;
        }
        return result;
    }
}
