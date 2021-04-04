package com.tec;

public class MonteeTetu extends PassagerAbstrait{
    
	Arret caractereArret;

    public MonteeTetu(String nom, int destination, Arret caractereArret) {
    	super(nom, destination);
    	this.caractereArret = caractereArret;
	}

	@Override
    public void choixPlaceMontee(Autobus t){
        t.monteeDemanderDebout(this);
    }

	@Override
	protected void faireChoixArret(Autobus t, int numeroArret) {
		caractereArret.choixPlaceArret(this, t, numeroArret);
		
	}
}
