package com.tec;

abstract class PassagerAbstrait implements Passager, Usager {

	protected Position placeOccupee;
    protected String nom;
    protected int destination;

    // constructor
    public PassagerAbstrait(String nom, int destination) {
        this.nom = nom;
        this.destination = destination;
        this.placeOccupee = Position.creer();
    }
    
    @Override
    public String toString() {
    	return nom() + placeOccupee;
    }

    //methods
    public String nom() {
        return this.nom;
    }

    public boolean estDehors() {
        return this.placeOccupee.estDehors();
    }

    public boolean estAssis() {
        return this.placeOccupee.estAssis();
    }

    public boolean estDebout() {
        return this.placeOccupee.estDebout();
    }

    public void changerEnDehors() {
        this.placeOccupee = this.placeOccupee.dehors();
    }

    public void changerEnAssis() {
        this.placeOccupee = this.placeOccupee.assis();
    }

    public void changerEnDebout() {
        this.placeOccupee = this.placeOccupee.debout();
    }
    
    protected void sortirADestination(Autobus t, int numeroArret) {
    	if(numeroArret == destination) {
            t.arretDemanderSortie(this);
        }
    }
    
    protected void monteAssisDebout(Autobus t) {
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        } else if(t.aPlaceDebout()) {
            t.monteeDemanderDebout(this);
        }
    }
    
    protected abstract void faireChoixArret(Autobus t, int numeroArret);
    
    public void nouvelArret(Autobus t, int numeroArret) {
    	sortirADestination(t, numeroArret);
    	if(!estDehors()) {
    		faireChoixArret(t, numeroArret);
    	}
    }
    
    
}
