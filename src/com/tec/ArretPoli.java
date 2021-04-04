package com.tec;

public class ArretPoli implements Arret {

    public void choixPlaceArret(Passager p, Autobus b, int distanceDestination){
        if(!b.aPlaceAssise() && b.aPlaceDebout()){
            p.changerEnDebout();
        }
    }
}
