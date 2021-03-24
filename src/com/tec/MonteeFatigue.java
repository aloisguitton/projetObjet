package com.tec;

public class MonteeFatigue extends PassagerAbstrait{

    public MonteeFatigue(String nom, int destination, int arret) {
        super(nom, destination, arret);
    }

    public void choixPlaceMontee(Autobus t){
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        }
    }
}
