package AbstractFactory;
import java.util.ArrayList;

import Course.AbstractCourse;
import Loto.AbstractJoueur;


public abstract class AbstractCourseFactory {
	protected AbstractCourse course;
	protected AbstractJoueur joueur1;
	protected ArrayList<AbstractJoueur> participants;
	
	public abstract AbstractJoueur creerJoueur ();
	public abstract AbstractCourse creerCourse ();
	public abstract ArrayList<AbstractJoueur> creerParticipants();
	public abstract void addParticipant (AbstractJoueur joueur);
	public abstract void jouer() throws Exception;
}
