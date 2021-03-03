package com.tec;

import java.util.ArrayList;
import java.util.Iterator;

public class Autobus {
    private final ArrayList<Passager> passager;
    private Jauge jaugeAssise;
    private Jauge jaugeDebout;
    private int arretCourant;

    // constructor
    public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
        int placeTotal = nbPlaceAssise+nbPlaceDebout;
        this.passager = new ArrayList<Passager>(placeTotal);
        this.jaugeAssise = new Jauge(nbPlaceAssise,0);
        this.jaugeDebout = new Jauge(nbPlaceDebout,0);
        this.arretCourant = 0;
    }

    @Override
    public String toString() {
        return   "[ arret:" + arretCourant +
                ", assis:" + jaugeAssise.toString() +
                ", debout: " + jaugeDebout.toString() +
                ']';
    }

    //methods
    public boolean aPlaceAssise() {
        return this.jaugeAssise.estVert();
    }

    public boolean aPlaceDebout() {
        return this.jaugeDebout.estVert();
    }

    public void monteeDemanderAssis(Passager p) {
        this.jaugeAssise.incrementer();
        p.changerEnAssis();
        this.passager.add(p);
    }

    public void monteeDemanderDebout(Passager p) {
        this.jaugeDebout.incrementer();
        p.changerEnDebout();
        this.passager.add(p);
    }

    public void allerArretSuivant() {
        ArrayList<Passager> clone = new ArrayList<>(passager);
        this.arretCourant ++;
        Iterator<Passager> it = clone.iterator();
        while(it.hasNext()) {
            it.next().nouvelArret(this,this.arretCourant);
        }
    }

    public void arretDemanderAssis(Passager p) {
        this.jaugeDebout.decrementer();
        this.jaugeAssise.incrementer();
        p.changerEnAssis();
    }

    public void arretDemanderDebout(Passager p) {
        this.jaugeAssise.decrementer();
        this.jaugeDebout.incrementer();
        p.changerEnDebout();
    }

    public void arretDemanderSortie(Passager p) {
        if (p.estAssis()){
            this.jaugeAssise.decrementer();
            this.passager.remove(p);
            p.changerEnDehors();
        }else if(p.estDebout()){
            this.jaugeDebout.decrementer();
            this.passager.remove(p);
            p.changerEnDehors();
        }
    }
}