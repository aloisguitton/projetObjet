package com.tec;//source without documentation for javadoc

class PassagerStandard extends PassagerAbstrait{
    
	// constructor
    public PassagerStandard(String nom, int destination) {
    	super(nom, destination);
    }
    
	@Override
	public void monterDans(Autobus t) {
		monteAssisDebout(t);
	}

	@Override
	protected void faireChoixArret(Autobus t, int numeroArret) {
		
	}

}