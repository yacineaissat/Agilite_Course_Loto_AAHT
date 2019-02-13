package Course;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CourseTest {

	protected Course course1;
	protected Participant particip1;


	public CourseTest() {
	}

	@Before
	public void setUp() // throws java.lang.Exception
	{
		course1 = new Course("Paris",2);
		particip1 = new Participant(course1);
	}

	@After
	public void tearDown() // throws java.lang.Exception
	{
	}

	@Test
	public void testAjoutTour() {
		course1 = new Course("Paris",2);
		assertEquals(7, course1.ajoutTour(5));
	}

	@Test
	public void testParticipantCourse() {
		course1 = new Course("Paris",2);
		particip1 = new Participant(course1);
		assertEquals(8, particip1.modifierTourCourse(6));
	}

	@Test
	public void testGetLieu() {
		Course course1 = new Course("Paris",2);
		Assert.assertEquals("Paris", course1.getLieu());
	}

	@Test
	public void testGetTour() {
		Course course1 = new Course("Paris",2);
		assertEquals("Vrai", 2, course1.getTour());
		Assert.assertTrue("Faux", 5 > course1.getTour());
		Assert.assertNotEquals("Faux", 7, course1.getTour());
	}

	@Test
	public void testSetLieu() {
		Course course1 = new Course("Paris",2);
		course1.setLieu("Lyon");
		Assert.assertEquals("Lyon", course1.getLieu());
		Assert.assertNotEquals("Dijon", course1.getLieu());
	}

	@Test
	public void testSetTour() {
		Course course1 = new Course("Paris",2);
		assertEquals("Vrai", 2, course1.getTour());
	}

}
