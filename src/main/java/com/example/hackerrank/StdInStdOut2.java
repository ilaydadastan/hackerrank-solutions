package com.example.hackerrank;

import java.util.Scanner;

public class StdInStdOut2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Double b = input.nextDouble();
        input.nextLine();
        String c = input.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
