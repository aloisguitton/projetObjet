package com.tec;

public class ArretAgoraphobe {
    public void choixPlaceArret(Passager p, Autobus b, int distanceDestination){
        if(!b.aPlaceDebout() && !b.aPlaceAssise()){
            p.changerEnDehors();
        }
    }
}
