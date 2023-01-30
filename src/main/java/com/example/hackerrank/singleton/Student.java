package com.example.hackerrank.singleton;

public class Student {
    private String name;
    private String email;

    private static Student instance;

    private Student(){
    }
    public static Student getInstance(){
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }

}
