package com.tec;

class PassagerStresse extends PassagerStandard implements Passager, Usager{


    // constructor
    public PassagerStresse(String nom, int destination) {
        super(nom, destination);
    }

    @Override
    public void monterDans(Autobus t) {
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        }
    }

    @Override
    public void nouvelArret(Autobus t, int numeroArret) {
        while(numeroArret >= (destination - 3)  && numeroArret != destination) {
        	if(this.estAssis()) {
        		if(t.aPlaceDebout()) {
        			t.arretDemanderDebout(this);
        		}
        	}
        }
    	if(numeroArret == destination) {
            t.arretDemanderSortie(this);
        }

    }
}
