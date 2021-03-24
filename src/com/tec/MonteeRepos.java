package com.tec;

public class MonteeRepos extends PassagerAbstrait{
    public MonteeRepos(String nom, int destination) {
        super(nom, destination);
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
