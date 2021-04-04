package com.tec;

public class MonteeSportif extends PassagerAbstrait{
	
	Arret caractereArret;

    public MonteeSportif(String nom, int destination, Arret caractereArret) {
		super(nom, destination);
		this.caractereArret = caractereArret;
	}

	@Override
    public void choixPlaceMontee(Autobus t){
        if(t.aPlaceDebout()){
            t.monteeDemanderDebout(this);
        }
    }

	@Override
	protected void faireChoixArret(Autobus t, int numeroArret) {
		caractereArret.choixPlaceArret(this, t, numeroArret);
		
	}
}
