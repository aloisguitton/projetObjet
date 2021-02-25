package com.tec;

import java.util.ArrayList;
import java.util.Iterator;

class Autobus {
    private final ArrayList<PassagerStandard> passagerStandards;
    private Jauge jaugeAssise;
    private Jauge jaugeDebout;
    private int arretCourant;

    // constructor
    public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
        int placeTotal = nbPlaceAssise+nbPlaceDebout;
        this.passagerStandards = new ArrayList<PassagerStandard>(placeTotal);
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

    public void monteeDemanderAssis(PassagerStandard p) {
        this.jaugeAssise.incrementer();
        p.changerEnAssis();
        this.passagerStandards.add(p);
    }

    public void monteeDemanderDebout(PassagerStandard p) {
        this.jaugeDebout.incrementer();
        p.changerEnDebout();
        this.passagerStandards.add(p);
    }

    public void allerArretSuivant() {
        this.arretCourant ++;
        Iterator<PassagerStandard> it = this.passagerStandards.iterator();
        while(it.hasNext()) {
            it.next().nouvelArret(this,this.arretCourant);
        }
    }

    public void arretDemanderAssis(PassagerStandard p) {
        this.jaugeDebout.decrementer();
        this.jaugeAssise.incrementer();
        p.changerEnAssis();
    }

    public void arretDemanderDebout(PassagerStandard p) {
        this.jaugeAssise.decrementer();
        this.jaugeDebout.incrementer();
        p.changerEnDebout();
    }

    public void arretDemanderSortie(PassagerStandard p) {
        if (p.estAssis()){
            this.jaugeAssise.decrementer();
            this.passagerStandards.remove(p);
            p.changerEnDehors();
        }else if(p.estDebout()){
            this.jaugeDebout.decrementer();
            this.passagerStandards.remove(p);
            p.changerEnDehors();
        }
    }
}