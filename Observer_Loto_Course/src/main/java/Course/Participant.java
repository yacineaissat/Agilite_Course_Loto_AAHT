package Course;

public class Participant
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    private Course course;

    /**
     * Constructeur d'objets de classe Participant
     */
    public Participant(Course c)
    {
        this.course=c;
    }

    public int modifierTourCourse(int x)
    {
       return this.course.ajoutTour(x);
    }
    

}
