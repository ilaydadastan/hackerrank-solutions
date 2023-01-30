package com.example.hackerrank.method_overriding;

public class Sports {

     String getName() {
        return "Generic Sports" ;
    }

    public void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
