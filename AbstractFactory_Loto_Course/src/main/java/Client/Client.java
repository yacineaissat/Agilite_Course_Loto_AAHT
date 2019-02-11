package Client;

import AbstractFactory.*;
import Loto.*;

public class Client {
	public static void main(String[] args) {
		AbstractCourseFactory courseVoitures = new ConcreteCourseFactory1();
		AbstractCourseFactory courseChevaux = new ConcreteCourseFactory2();
		AbstractJoueur joueur1 = new Joueur(); 
		
		((Joueur)joueur1).creerJeu();
		
		courseVoitures.addParticipant(joueur1);
		courseChevaux.addParticipant(joueur1);
		
		try {
			courseVoitures.jouer();
			courseChevaux.jouer();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}