package com.example.hackerrank;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int k = 0; k < q ; k++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for (int i = 0; i <n; i++) {
                int count = a;
                for (int j = 0; j <=i; j++) {
                    int result = (int) ((Math.pow(2, j)*b));
                    count = count + result;
                }
                System.out.print(count + " ");
            }
            System.out.println();
        }



    }
}
