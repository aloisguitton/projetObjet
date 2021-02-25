package com.tec;//source without documentation for javadoc

class PassagerStandard {

    private Position placeOccupee;
    private String nom;
    private int destination;

    // constructor
    public PassagerStandard(String nom, int destination) {
        this.nom = nom;
        this.destination = destination;
        this.placeOccupee = new Position();
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
        this.placeOccupee.dehors();
    }

    public void changerEnAssis() {
        this.placeOccupee.assis();
    }

    public void changerEnDebout() {
        this.placeOccupee.debout();
    }

    public void monterDans(Autobus t) {
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        }
    }

    public void nouvelArret(Autobus t, int numeroArret) {
    	if(numeroArret == destination) {
    		t.arretDemanderSortie(this);
    	}
    	
    }
}