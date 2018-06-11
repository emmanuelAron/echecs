package echecs;

import java.util.ArrayList;
import java.util.List;

public class Cavalier {

	public static List<Case> deplacements(Case c) {
		/****
		 * Un cavalier , au centre de l'echiquier a 8 deplacements possibles (donc 8 cases differentes)
		 * Le cas des bords n'est pas traité ici.
		 */
		List<Case> cases = new ArrayList<Case>();
		Case nordDroiteSup = new Case(c.getX()+1,c.getY()-2);
		Case nordDroiteInf = new Case(c.getX()+2,c.getY()-1);
		Case nordGaucheSup = new Case(c.getX()-1,c.getY()-2);
		Case nordGaucheInf = new Case(c.getX()-2,c.getY()-1);
		
		Case sudDroiteSup = new Case(c.getX()+1,c.getY()+2);
		Case sudDroiteInf = new Case(c.getX()+2,c.getY()+1);
		Case sudGaucheSup = new Case(c.getX()-1,c.getY()+2);
		Case sudGaucheInf = new Case(c.getX()-2,c.getY()+1);
		
		cases.add(nordDroiteSup);
		cases.add(nordDroiteInf);
		cases.add(nordGaucheSup);
		cases.add(nordGaucheInf);
		cases.add(sudDroiteSup);
		cases.add(sudDroiteInf);
		cases.add(sudGaucheSup);
		cases.add(sudGaucheInf);
		return cases;
	}

}
