package AbstractFactory;

import java.util.ArrayList;

import Loto.*;
import Course.*;

public class ConcreteCourseFactory2 extends AbstractCourseFactory{

	public ConcreteCourseFactory2() {
		course = creerCourse();
		joueur1 = creerJoueur();
		course.setResultat((Loto) joueur1);
		
		participants = creerParticipants();
		System.out.println("-- Course de chevaux --");
		course.afficherCoureurs();
	}
	
	@Override
	public AbstractJoueur creerJoueur() {
		return new Loto("rouge");
	}

	@Override
	public AbstractCourse creerCourse() {
		return new CourseChevaux("Paris", 5);
	}

	@Override
	public ArrayList<AbstractJoueur> creerParticipants() {
		return new ArrayList<AbstractJoueur>();
	}

	@Override
	public void addParticipant(AbstractJoueur joueur) {
		participants.add(joueur);
	}

	@Override
	public void jouer() throws Exception {
		if (course == null ) throw new Exception("Course de chevaux - Aucune course n'a été lancée");
		if (course == null ) throw new Exception("Course de chevaux - Aucune résultat n'est disponible pour la course");
		if (participants.size() == 0) throw new Exception ("Course de chevaux - Aucun joueur n'est enregistré");
		
		for (AbstractJoueur participant : participants ) {
			System.out.println("Course de chevaux - Votre gain est de : " + course.calculerGain(((Joueur) participant).getJeu()));
		}
	}

}
