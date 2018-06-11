package test;

import org.junit.jupiter.api.Test;

import echecs.Case;
import echecs.Plateau;

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
		
		Plateau p = new Plateau();
		
		assertThat(p).isEqualTo(tableauCases);
	}
	@Test
	public void case_appartient_au_tableau() {
		Case dedans = new Case(2,3);
		Case dehors = new Case(8,10);
		assertThat(Plateau.appartientTableau(dedans.getX(),dedans.getY())).isEqualTo(true);
		assertThat(Plateau.appartientTableau(dehors.getX(),dehors.getY())).isEqualTo(false);
	}
	
}
