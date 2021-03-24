package com.tec;

public class MonteeRepos extends PassagerAbstrait{
    public MonteeRepos(String nom, int destination, int arret) {
        super(nom, destination, arret);
    }

    public void choixPlaceMontee(Autobus t){
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        }
        else if(t.aPlaceDebout()){
            t.monteeDemanderDebout(this);
        }
    }
}
