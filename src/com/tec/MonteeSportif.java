package com.tec;

public class MonteeSportif extends PassagerAbstrait{
    public MonteeSportif(String nom, int destination) {
        super(nom, destination);
    }

    public void choixPlaceMontee(Autobus t){
        if(t.aPlaceDebout()){
            t.monteeDemanderDebout(this);
        }
    }
}
