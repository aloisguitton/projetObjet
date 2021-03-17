package com.tec;

class PassagerLunatique extends PassagerAbstrait{

    // constructor
    public PassagerLunatique(String nom, int destination) {
    	super(nom, destination);
    }
    
    public void monterDans(Autobus t) {
    	monteAssisDebout(t);
    }

	@Override
	void faireChoixArret(Autobus t, int numeroArret) {
		if(estAssis()){
	    	t.arretDemanderDebout(this);
	    }
	    else if(estDebout()){
	    	t.arretDemanderAssis(this);
        }
	}
}

