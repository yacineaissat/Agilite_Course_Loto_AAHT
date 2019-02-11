package Course;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CourseTest {
	// Définissez ici les variables d'instance nécessaires à vos engagements;
	// Vous pouvez également les saisir automatiquement du présentoir
	// à l'aide du menu contextuel "Présentoir --> Engagements".
	// Notez cependant que ce dernier ne peut saisir les objets primitifs
	// du présentoir (les objets sans constructeur, comme int, float, etc.).
	protected Course course1;
	protected Participant particip1;

	/**
	 * Constructeur de la classe-test CourseTest
	 */
	public CourseTest() {
	}

	/**
	 * Met en place les engagements.
	 *
	 * Méthode appelée avant chaque appel de méthode de test.
	 */
	@Before
	public void setUp() // throws java.lang.Exception
	{
		course1 = new Course("Paris",2);
		particip1 = new Participant(course1);
	}

	/**
	 * Supprime les engagements
	 *
	 * Méthode appelée après chaque appel de méthode de test.
	 */
	@After
	public void tearDown() // throws java.lang.Exception
	{
		// Libérez ici les ressources engagées par setUp()
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

	// TP2 Couverture de test
	// Test des Getters
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

	// Test des Setters
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

	// test Association
	@Test
	public void testAddParticipant() {
		course1 = new Course("Paris",2);
		particip1 = new Participant(course1);
		assertEquals(1, course1.addParticipant(particip1));
		Participant particip2 = particip1 = new Participant(course1);
		assertEquals(2, course1.addParticipant(particip2));
		Assert.assertNotEquals(4, course1.addParticipant(particip2));
	}

}
