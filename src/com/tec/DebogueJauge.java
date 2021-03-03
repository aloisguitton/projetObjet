package com.tec;

class DebogueJauge {

    public static void main(String[] args){
        Jauge j1 = new Jauge(5,0);

        System.out.println("estRouge : "+j1.estRouge());
        System.out.println("estVert : "+j1.estVert());

        if(j1.estVert()){
            j1.incrementer();
        }
        else if (j1.estRouge()){
            j1.decrementer();
        }
        System.out.println(j1.toString());
    }
}
