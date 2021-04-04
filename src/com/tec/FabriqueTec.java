package com.tec;

public class FabriqueTec {

	static public Arret faireArretAgoraphobe() {
		return new ArretAgoraphobe();
	}
	
	static public Arret faireArretCalme() {
		return new ArretCalme();
	}
	
	static public Arret faireArretNerveux() {
		return new ArretNerveux();
	}

	static public Arret faireArretPoli() {
		return new ArretPoli();
	}
	
	static public Arret faireArretPrudent() {
		return new ArretPrudent();
	}
	
	static public PassagerAbstrait faireMonteeFatigue(String nom, int destination, Arret caractereArret) {
		return new MonteeFatigue(nom, destination, caractereArret);
	}
	
	static public PassagerAbstrait faireMonteeRepos(String nom, int destination, Arret caractereArret) {
		return new MonteeRepos(nom, destination, caractereArret);
	}
	
	static public PassagerAbstrait faireMonteeSportif(String nom, int destination, Arret caractereArret) {
		return new MonteeSportif(nom, destination, caractereArret);
	}
	
	static public PassagerAbstrait faireMonteeTetu(String nom, int destination, Arret caractereArret) {
		return new MonteeTetu(nom, destination, caractereArret);
	}

}
