package com.example.hackerrank;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(32));
        for (int i = 0; i <3 ; i++) {
            String a = scanner.next();
            int b = scanner.nextInt();
            System.out.println(a + " ".repeat(15-a.length()) + String.format("%03d", b));
        }
        System.out.println("=".repeat(32));

    }
}
