package com.tec;

class PassagerLunatique extends PassagerAbstrait{

    // constructor
    public PassagerLunatique(String nom, int destination) {
    	super(nom, destination);
    }
    
    public void monterDans(Autobus t) {
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        } else if(t.aPlaceDebout()) {
            t.monteeDemanderDebout(this);
        }
    }

    public void nouvelArret(Autobus t, int numeroArret) {    
    	super.sortirADestination(t, numeroArret);
    	if(!estDehors()) {
        	if(estAssis()){
    	    	t.arretDemanderDebout(this);
    	    }
    	    else if(estDebout()){
    	    	t.arretDemanderAssis(this);
            }
    	}    
    }
}

