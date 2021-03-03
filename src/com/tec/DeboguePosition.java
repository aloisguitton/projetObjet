package com.tec;

public class DeboguePosition {

    public static void main(String[] args){
        Position p1 = new Position();


        System.out.println(p1.estAssis());
        System.out.println(p1.estDebout());
        System.out.println(p1.estDehors());
        System.out.println(p1.estInterieur());


        p1 = p1.assis();
        p1.toString();
        p1 = p1.debout();
        p1.toString();
        p1 = p1.dehors();
        p1.toString();

    }


}
