package com.example.hackerrank.method_overriding;

public class Soccer extends Sports{

    @Override
    String getName(){
        return "Soccer";
    }

    @Override
    public void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
