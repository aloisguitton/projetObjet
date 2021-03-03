package com.tec;

interface Passager {

    public String toString();

    public String nom();

    public boolean estDehors();

    public boolean estAssis();

    public boolean estDebout();

    public void changerEnDehors();

    public void changerEnAssis();

    public void changerEnDebout();

    public void nouvelArret(Autobus t, int numeroArret);
}
