package echecs;

public class Plateau {
	
	private final static int LONGUEUR = 8;
	private final static int LARGEUR = 8;
	
	private Case[][] plateau = new Case[LONGUEUR][LARGEUR];
	
	public Case[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}

	public static int longueur() {
		return LONGUEUR;
	}

	public static int largeur() {
		return LARGEUR;
	}

	/**
	 * Creation d un plateau de cases vides
	 */
	public Plateau() {
		for(int i=0; i< LONGUEUR ; i++) {
			for(int j=0; j< LARGEUR ; j++) {
				plateau[i][j] = new Case(i,j);
			}
		}
	}
	
	/***
	 * 
	 * @param x 
	 * @param y
	 * @return vrai si les coordonnees de la case appartiennent au tableau , et faux sinon
	 */
	public static boolean appartientTableau(int x , int y) {
		return !(x < 0 || x > 8 || y < 0 || y > 8);
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public String toString() {
		return "";
	}


	
}
