package Loto;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class JoueurTest {
 protected Joueur joueur1 = new Joueur(0);
 protected Balle balle1 = new Balle(5, "classique");
 
 public JoueurTest() 
 {
 }
 
 @Before
 public void setUp() // throws java.lang.Exception
 {
 }
 
 @After
 public void tearDown() 
 {
 }
 
 @Test
 public void testJeu() {
	 int min = 1;
	 int max = 999;
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