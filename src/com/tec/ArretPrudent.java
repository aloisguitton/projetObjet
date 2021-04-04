package com.tec;

public class ArretPrudent implements Arret {
    public void choixPlaceArret(Passager p, Autobus b, int distanceDestination){
        if(p.estDebout() && distanceDestination > 5 && b.aPlaceAssise()){
            p.changerEnAssis();
        }
        else if(p.estAssis() && distanceDestination < 3 && b.aPlaceDebout()){
            p.changerEnDebout();
        }
    }
}
