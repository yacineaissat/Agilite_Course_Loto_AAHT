package Course;

public class Participant
{ 
    private Course course;

    public Participant(Course c)
    {
        this.course=c;
    }

    public int modifierTourCourse(int x)
    {
       return this.course.ajoutTour(x);
    }
    
}
