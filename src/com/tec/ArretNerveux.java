package com.tec;

public class ArretNerveux {
    public void choixPlaceArret(Passager p, Autobus b, int distanceDestination){
        if(p.estAssis() && b.aPlaceDebout()){
            p.changerEnDebout();
        }
        else if(p.estDebout() && b.aPlaceAssise()){
            p.changerEnAssis();
        }
    }
}
