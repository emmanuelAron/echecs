package echecs;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PlateauTest {
	
	@Test
	public void longueur_plateau_should_be_8() {
		assertThat(Plateau.longueur()).isEqualTo(8);
	}
	@Test
	public void longueur_largeur_should_be_8() {
		assertThat(Plateau.largeur()).isEqualTo(8);
	}
	@Test
	public void creer_tableau_2D_de_64_cases_vide() {
		Case[][] tableauCases = new Case[][] {
			
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},//1ere ligne
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()},
			{new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case(),new Case()}
		};
		assertThat(Plateau.creerPlateauVide()).isEqualTo(tableauCases);
	}
}
