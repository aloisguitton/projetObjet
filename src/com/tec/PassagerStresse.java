package com.tec;

class PassagerStresse extends PassagerAbstrait{

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
	void faireChoixArret(Autobus t, int numeroArret) {
        while(numeroArret >= (destination - 3)  && numeroArret != destination) {
        	if(this.estAssis()) {
        		if(t.aPlaceDebout()) {
        			t.arretDemanderDebout(this);
        		}
        	}
        }
	}

    
}
