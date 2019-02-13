import Course.*;
import Observer.*;
import Loto.*;

public class Main {
	public static void main (String [] args) {
		Course cs = new Course("Octogone", 5);
		CourseObserver simulationCourse = new Loto("rouge");
		CourseObserver joueur = new Joueur();

		simulationCourse.setCourse(cs);
		cs.addObserver(simulationCourse);
		cs.addObserver(joueur);
		cs.jouer();		
	}
}
