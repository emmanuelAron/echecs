package test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import echecs.Case;
import echecs.Cavalier;

public class PieceTest {

	//(cas ou les 8 cases d'arrivee appartiennent au plateau)
	@Test
	public void cavalier_a_8_deplacements_possibles_au_maximum() {
		Case c = new Case(4,4);
		assertThat(Cavalier.deplacements(c).size()).isEqualTo(8);
	}
}
