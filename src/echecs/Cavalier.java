package echecs;

import java.util.ArrayList;
import java.util.List;

public class Cavalier {

	public static List<Case> deplacements(Case c) {
		/*
		  Un cavalier , au centre de l'echiquier a 8 deplacements possibles
		  (donc 8 cases differentes)
		 */
		List<Case> cases = new ArrayList<>();

		final int droite = c.getX() + 1;
		final int deuxNord = c.getY() - 2;
        final int deuxDroite = c.getX() + 2;
        final int nord = c.getY() - 1;
        final int gauche = c.getX() - 1;
        final int deuxGauche = c.getX() - 2;
        final int deuxSud = c.getY() + 2;
        final int sud = c.getY() + 1;

		Case nordDroiteSup = new Case(droite, deuxNord);
		Case nordDroiteInf = new Case(deuxDroite, nord);
		Case nordGaucheSup = new Case(gauche, deuxNord);
		Case nordGaucheInf = new Case(deuxGauche, nord);
		Case sudDroiteSup = new Case(droite, deuxSud);
        Case sudDroiteInf = new Case(deuxDroite, sud);
		Case sudGaucheSup = new Case(gauche, deuxSud);
		Case sudGaucheInf = new Case(deuxGauche, sud);

		if(Plateau.appartientTableau(nordDroiteSup.getX(), nordDroiteSup.getY()))
			cases.add(nordDroiteSup);
		if(Plateau.appartientTableau(nordDroiteInf.getX(), nordDroiteInf.getY()))
			cases.add(nordDroiteInf);
		if(Plateau.appartientTableau(nordGaucheSup.getX(), nordGaucheSup.getY()))
			cases.add(nordGaucheSup);
		if(Plateau.appartientTableau(nordGaucheInf.getX(), nordGaucheInf.getY()))
			cases.add(nordGaucheInf);
		if(Plateau.appartientTableau(sudDroiteSup.getX(), sudDroiteSup.getY()))
			cases.add(sudDroiteSup);
		if(Plateau.appartientTableau(sudDroiteInf.getX(), sudDroiteInf.getY()))
			cases.add(sudDroiteInf);
		if(Plateau.appartientTableau(sudGaucheSup.getX(), sudGaucheSup.getY()))
		cases.add(sudGaucheSup);
		if(Plateau.appartientTableau(sudGaucheInf.getX(), sudGaucheInf.getY()))
			cases.add(sudGaucheInf);
		return cases;
	}

}
