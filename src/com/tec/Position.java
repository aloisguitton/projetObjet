package com.tec;

/**
 * Cette classe repr'esente la position d'un passager par rapport 'a un transport.
 * Une position a trois 'etats possibles : assis dans un transport, 
 * debout dans un transport et dehors d'un transport.
 *
 * Les instances de cette classe sont des objets constants.
 *
 * @author Georgy
 * @since 2007-2019
 **/
class Position {
	  private static final Position DEHORS = new Position();
	  private static final Position ASSIS  = new Position();
	  private static final Position DEBOUT = new Position();

	  /**
	   * Fournit une instance de Position dehors.
	   *
	   * @return instance dans l'etat dehors.
	   */
	  public static Position creer() {
	    return DEHORS;
	  }

	  //instanciation possible uniquement dans la classe.  
	  private Position() {
	  }

	  public boolean estDehors() {
	    return this == DEHORS;
	  }

	  public boolean estAssis() {
	    return this == ASSIS;
	  }

	  public boolean estDebout() {
	    return this == DEBOUT;
	  }

	  public boolean estInterieur() {
	    return this != DEHORS;
	  }

	  public Position assis() {
	    return ASSIS;
	  }

	  public Position debout() {
	    return DEBOUT;
	  }

	  public Position dehors() {
	    return DEHORS;
	  }

	  @Override
	  public String toString() {
	    String nom = null;

	    if (this == DEHORS)
	      nom = "endehors";
	    else if (this == ASSIS)
	      nom = "assis";
	    else if (this == DEBOUT)
	      nom = "debout";

	    return "<" + nom + ">";
	  }
	}