package com.tec;

public class ArretAgoraphobe implements Arret {
    public void choixPlaceArret(Passager p, Autobus b, int distanceDestination){
        if(!b.aPlaceDebout() && !b.aPlaceAssise()){
            p.changerEnDehors();
        }
    }
}
