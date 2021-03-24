package com.tec;

public class MonteeTetu extends PassagerAbstrait{
    public MonteeTetu(String nom, int destination, int arret) {
        super(nom, destination, arret);
    }

    public void choixPlaceMontee(Autobus t){
        t.monteeDemanderDebout(this);
    }
}
