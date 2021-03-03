package com.tec;

public class FabriqueTec {

    static public PassagerStandard fairePassagerStandard(String nom, int destination ) {
        return new PassagerStandard(nom, destination);
    }

    static public PassagerLunatique fairePassagerLunatique(String nom, int destination ) {
        return new PassagerLunatique(nom,destination);
    }

    static public PassagerStresse fairePassagerStresse(String nom, int destination ) {
        return new PassagerStresse(nom, destination);
    }

}
