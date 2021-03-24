package com.tec;

public class MonteeSportif extends PassagerAbstrait{
    public MonteeSportif(String nom, int destination, int arret) {
        super(nom, destination, arret);
    }

    public void choixPlaceMontee(Autobus t){
        if(t.aPlaceDebout()){
            t.monteeDemanderDebout(this);
        }
    }
}
