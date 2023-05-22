package com.example.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromicPermutations {
    public static boolean solution(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
                if (oddCount > 1) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = solution(input);
        System.out.println(result);
    }
}
