package com.tec;

public interface Passager {

    public String toString();
	
    public String nom();

    public boolean estDehors();

    public boolean estAssis();

    public boolean estDebout();

    public void changerEnDehors();

    public void changerEnAssis();

    public void changerEnDebout();

    public void monterDans(Autobus t);

    public void nouvelArret(Autobus t, int numeroArret);
}
