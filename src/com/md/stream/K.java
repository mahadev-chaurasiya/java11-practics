package com.md.stream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class K {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want factorial :");
        int num = sc.nextInt();
        var factorial = IntStream.range(1, num)
                .reduce(1, (subtotal, value)->subtotal *value);
        System.out.println(factorial);
        sc.close();
    }
}
