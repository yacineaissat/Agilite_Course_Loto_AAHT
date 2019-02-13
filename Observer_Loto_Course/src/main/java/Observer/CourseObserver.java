package Observer;
import Course.*;
import Loto.*;

public abstract class CourseObserver {

	private Course course;
	protected static Balle [] coureurs = null;
	protected static boolean jouer = false;
	
	public void setCourse (Course course) {
		this.course = course;
	}

	public void update( Balle [] resultatCourse) {
		this.course.setResultat(resultatCourse);
	}
	
	public abstract void jouer() ;
	public abstract void calculerGain(Balle[] resultat);
	
}
