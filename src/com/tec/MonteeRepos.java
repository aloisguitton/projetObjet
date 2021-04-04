package com.tec;

public class MonteeRepos extends PassagerAbstrait{
    
	Arret caractereArret;

    public MonteeRepos(String nom, int destination, Arret caractereArret) {
		super(nom, destination);
		this.caractereArret = caractereArret;
	}

	@Override
    public void choixPlaceMontee(Autobus t){
        if(t.aPlaceAssise()){
            t.monteeDemanderAssis(this);
        }
        else if(t.aPlaceDebout()){
            t.monteeDemanderDebout(this);
        }
    }

	@Override
	protected void faireChoixArret(Autobus t, int numeroArret) {
		caractereArret.choixPlaceArret(this, t, numeroArret);
		
	}
}
