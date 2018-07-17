package echecs;

import java.util.ArrayList;
import java.util.List;

public class Cavalier {

	public static List<Case> deplacements(Case c) {
		/****
		 * Un cavalier , au centre de l'echiquier a 8 deplacements possibles (donc 8 cases differentes)
		 * 
		 */
		List<Case> cases = new ArrayList<>();
		Case nordDroiteSup = new Case(c.getX()+1,c.getY()-2);
		Case nordDroiteInf = new Case(c.getX()+2,c.getY()-1);
		Case nordGaucheSup = new Case(c.getX()-1,c.getY()-2);
		Case nordGaucheInf = new Case(c.getX()-2,c.getY()-1);
		
		Case sudDroiteSup = new Case(c.getX()+1,c.getY()+2);
		Case sudDroiteInf = new Case(c.getX()+2,c.getY()+1);
		Case sudGaucheSup = new Case(c.getX()-1,c.getY()+2);
		Case sudGaucheInf = new Case(c.getX()-2,c.getY()+1);
		
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
