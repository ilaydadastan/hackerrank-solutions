package com.example.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (N%2 == 1 || (6<=N && N<=20)) {
            System.out.println("Weird");
        }
        else {
                System.out.println("Not Weird");
        }
    }
}
