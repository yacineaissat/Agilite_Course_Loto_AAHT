package Course;

public class CourseVoiture extends AbstractCourse{
	private String lieu;
	private int tour;
	
	public CourseVoiture(String lieu, int tour) {
		this.lieu = lieu;
		this.tour = tour;
	}

	
	public void setLieu(String y) {
		this.lieu = y;
	}

	
	public String getLieu() {
		return lieu;
	}

	
	public void setTour(int y) {
		this.tour = y;
	}

	public int getTour() {
		return tour;
	}

	public int ajoutTour(int y) {
		return this.tour = this.tour + y;
	}

}
