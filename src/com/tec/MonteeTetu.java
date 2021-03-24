package com.tec;

public class MonteeTetu extends PassagerAbstrait{
    public MonteeTetu(String nom, int destination) {
        super(nom, destination);
    }

    public void choixPlaceMontee(Autobus t){
        t.monteeDemanderDebout(this);
    }
}
