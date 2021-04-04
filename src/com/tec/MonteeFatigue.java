package com.tec;

public class MonteeFatigue extends PassagerAbstrait{
	
	Arret caractereArret;

    public MonteeFatigue(String nom, int destination, Arret caractereArret) {
    	super(nom, destination);
    	this.caractereArret = caractereArret;
	}

	@Override
    public void choixPlaceMontee(Autobus t){
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        }
    }

	@Override
	protected void faireChoixArret(Autobus t, int numeroArret) {
		caractereArret.choixPlaceArret(this, t, numeroArret);
		
	}
}
