import com.tec.*;

class Simple {

	/*
	 * Affiche les etats d'un usager et d'un transport.
	 * Sur un parametre de type Object, la methode println()
	 * utilise la methode toString().
	 * La methodes toString() doit etre redefinie dans les
	 * deux classes PassagerStandard et Autobus.
	 */
	static private void deboguerEtat (Autobus t, Usager p) {
		System.out.println(p);
		System.out.println(t);
	}

	static public void main (String[] args) {

		Autobus serenity = new Autobus(1, 2);

		Usager kaylee = FabriqueTec.faireMonteeRepos("Kaylee", 4, FabriqueTec.faireArretCalme());
		Usager jayne = FabriqueTec.faireMonteeFatigue("Jayne", 4, FabriqueTec.faireArretPrudent());
		Usager inara = FabriqueTec.faireMonteeSportif("Inara", 5, FabriqueTec.faireArretNerveux());

		System.out.println(serenity);

		serenity.allerArretSuivant();
		//1
		kaylee.choixPlaceMontee(serenity);

		System.out.println(serenity);
		System.out.println(kaylee);

		serenity.allerArretSuivant();
		//2
		jayne.choixPlaceMontee(serenity);

		System.out.println(serenity);
		System.out.println(kaylee);
		System.out.println(jayne);

		serenity.allerArretSuivant();
		//3
		inara.choixPlaceMontee(serenity);

		System.out.println(serenity);
		System.out.println(kaylee);
		System.out.println(jayne);
		System.out.println(inara);

		serenity.allerArretSuivant();
		//4
		System.out.println(serenity);
		System.out.println(kaylee);
		System.out.println(jayne);
		System.out.println(inara);

		serenity.allerArretSuivant();
		//5
		System.out.println(serenity);
		System.out.println(kaylee);
		System.out.println(jayne);
		System.out.println(inara);
	}
}

	/* Resultat de l'execution.
	[arret:0, assis:<0 [0,1[>, debout: <0 [0,2[>]
	[arret:1, assis:<1 [0,1[>, debout: <0 [0,2[>]
	Kaylee <assis>
	[arret:2, assis:<1 [0,1[>, debout: <1 [0,2[>]
	Kaylee <assis>
	Jayne <debout>
	[arret:3, assis:<1 [0,1[>, debout: <2 [0,2[>]
	Kaylee <assis>
	Jayne <debout>
	Inara <debout>
	[arret:4, assis:<0 [0,1[>, debout: <1 [0,2[>]
	Kaylee <endehors>
	Jayne <endehors>
	Inara <debout>
	[arret:5, assis:<0 [0,1[>, debout: <0 [0,2[>]
	Kaylee <endehors>
	Jayne <endehors>
	Inara <endehors>
	*/