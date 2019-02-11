package Course;

import Loto.*;

public abstract class AbstractCourse {
	protected Loto resultat;
	
	public void setResultat(Loto res) {
		resultat = res;
	}
	
	public void afficherCoureurs() {
		resultat.afficherCoureurs();
	}
	
	public int calculerGain(Balle [] jeu) {
		return resultat.calculerGain(jeu);
	}
}
