package com.example.hackerrank.singleton;

public class Singleton {
   public String str;

   private static Singleton instance;

   private Singleton(){
   }

   public static Singleton getSingleInstance(){
       if (instance == null) {
           instance = new Singleton();
       }
       return instance;
   }

}
