package com.tec;

public class DeboguePosition {

    public static void main(String args){
        Position p1 = new Position();


        System.out.println(p1.estAssis());
        System.out.println(p1.estDebout());
        System.out.println(p1.estDehors());
        System.out.println(p1.estInterieur());


        p1 = Position.debout();
    }

    private void testPosition(Position p){
        System.out.println(p.estAssis());
        System.out.println(p.estDebout());
        System.out.println(p.estDehors());
        System.out.println(p.estInterieur());
    }
}
