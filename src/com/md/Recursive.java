package com.md;

public class Recursive {
    public static void main(String[] args){
        System.out.println(factorial(4));
        recurs(4);
        System.out.println(sum(4 ));
    }

    private static int sum(int val){
        System.out.println("Hello sum");
        if (val == 1){
            return val;
        }
        return val + sum(val - 1);
    }

    private static void recurs(int val){
        System.out.println("Hello");
        if (val == 0){
            return;
        }
        recurs(val - 1);
    }
    private static int factorial(int numb){
        int result = 1;
        for (int i = numb; i >0 ; i--) {
            result *= i;
        }
        return result;
    }
}
