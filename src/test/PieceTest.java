package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import echecs.Case;
import echecs.Cavalier;
import echecs.Tour;

public class PieceTest {

	//(cas ou les 8 cases d'arrivee appartiennent au plateau)
	@Test
	public void cavalier_au_centre_a_8_deplacements_possibles() {
		Case c = new Case(4,4);
		assertThat(Cavalier.deplacements(c).size()).isEqualTo(8);
	}
	@Test
	public void cavalier_au_coin_de_l_echiquier() {
		Case c = new Case(0,0);
		assertThat(Cavalier.deplacements(c).size()).isEqualTo(2);
	}
	@Test
	public void tour_au_centre_a_14_deplacements_possibles() {
		Case c = new Case(4,4);
		assertThat(Tour.deplacements(c).size()).isEqualTo(14);
	}
}
