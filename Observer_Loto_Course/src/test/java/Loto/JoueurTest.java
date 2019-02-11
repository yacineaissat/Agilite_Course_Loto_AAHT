package Loto;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class JoueurTest {
 protected Joueur joueur1 = new Joueur(0);
 protected Balle balle1 = new Balle(5, "classique");
 
 /**
  * Constructeur de la classe-test BalleTest
  */
 public JoueurTest() {
 }
 /**
  * Met en place les engagements.
  *
  * Méthode appelée avant chaque appel de méthode de test.
  */
 @Before
 public void setUp() // throws java.lang.Exception
 {
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
 public void testJeu() {
	 int min = 1;
	 int max = 49;
	 for(int i = 1; i<6; i++) {
		 assertTrue("Error, random is too high", max >= joueur1.getJeu()[i].getNumero());
		 assertTrue("Error, random is too high", min <= joueur1.getJeu()[i].getNumero());
	 }
 }
 
 
 @Test
 public void testSetId() {
	 	joueur1.setId(2);
  assertEquals(2, joueur1.getId());
 }
 
 
}
 
 