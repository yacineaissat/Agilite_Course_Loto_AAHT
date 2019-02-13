package Client;

import AbstractFactory.*;
import Loto.*;

public class Client {
	public static void main(String[] args) {
		AbstractCourseFactory courseVoitures = new ConcreteCourseFactory1();
		AbstractCourseFactory courseChevaux = new ConcreteCourseFactory2();
		// Design Pattern AbstractFactory : Dupliquez cette partie du code pour créer autant de joueurs que vous le souhaitez
		AbstractJoueur joueur1 = new Joueur();
		((Joueur)joueur1).creerJeu();
		courseVoitures.addParticipant(joueur1);
		courseChevaux.addParticipant(joueur1);
		// Fin de la partie à dupliquer
		
		try {
			courseVoitures.jouer();
			courseChevaux.jouer();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}