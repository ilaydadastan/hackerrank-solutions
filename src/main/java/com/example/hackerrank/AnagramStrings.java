package com.example.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
    public static boolean solution(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] c1 = string1.toCharArray();
        char[] c2 = string2.toCharArray();
        Arrays.sort(c1); //sorting
        Arrays.sort(c2); ///sorting
        return Arrays.equals(c1, c2); //checking equality and return true or false
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("string1: ");
        String string1 = scanner.nextLine();
        System.out.print("string2: ");
        String string2 = scanner.nextLine();

        boolean result = solution(string1, string2);
        System.out.println(result);
    }
}
