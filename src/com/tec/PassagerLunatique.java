package com.tec;

class PassagerLunatique extends PassagerStandard implements Passager, Usager{

    // constructor
    public PassagerLunatique(String nom, int destination) {
    	super(nom, destination);
    }

    public void nouvelArret(Autobus t, int numeroArret) {
        if(numeroArret == destination) {
            t.arretDemanderSortie(this);
        }
        else{
            if(estAssis()){
                t.arretDemanderDebout(this);
            }
            else if(estDebout()){
                t.arretDemanderAssis(this);
            }
        }
    }



}
