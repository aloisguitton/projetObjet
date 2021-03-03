package com.tec;

class PassagerStresse implements Passager, Usager{
    private Position placeOccupee;
    private String nom;
    private int destination;

    // constructor
    public PassagerStresse(String nom, int destination) {
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

    public void monterDans(Autobus t) {
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        }
    }

    public void nouvelArret(Autobus t, int numeroArret) {
        while(numeroArret >= (destination - 3)  && numeroArret != destination) {
        	if(this.estAssis()) {
        		if(t.aPlaceDebout()) {
        			this.changerEnDebout();
        		}
        	}
        }
    	if(numeroArret == destination) {
            t.arretDemanderSortie(this);
        }

    }
}
