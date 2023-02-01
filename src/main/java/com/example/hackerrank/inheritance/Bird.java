package com.example.hackerrank.inheritance;

public class Bird implements Animal {
    @Override
    public void walk()
    {
        System.out.println("I am walking");
    }
    public void fly()
    {
        System.out.println("I am flying");
    }
    public void sing()
    {
        System.out.println("I am singing");
    }
}
