package Loto;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BalleTest {
 protected Balle balle1 = new Balle("classique");
 protected Balle balle2 = new Balle(5, "classique");
 
 /**
  * Constructeur de la classe-test BalleTest
  */
 public BalleTest() {
 }
 /**
  * Met en place les engagements.
  *
  * Méthode appelée avant chaque appel de méthode de test.
  */
 @Before
 public void setUp() // throws java.lang.Exception
 {
  balle1 = new Balle("classique");
  balle2 = new Balle(5, "classique");
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
 public void testNumeroGet() {
  balle2 = new Balle(5, "classique");
  assertEquals(5, balle2.getNumero());
 }
 
 @Test
 public void testGetType() {
  assertEquals("classique", balle1.getType());
  assertEquals("classique", balle2.getType());
 }
 
 @Test
 public void testGetCouleur() {
  assertEquals("rouge", balle1.getCouleur());
  assertEquals("rouge", balle2.getCouleur());
 }
 // TP2 Couverture de test
 // Test des Getters
 @Test
 public void testGetNumero() {
  Assert.assertEquals(5, balle2.getNumero());
 }
 // Test des Setters
 @Test
 public void testSetNumero() {
  balle2.setNumero(15);
  Assert.assertEquals(15, balle2.getNumero());
  Assert.assertNotEquals(5, balle2.getNumero());
 }
 
 @Test
 public void testSetType() {
  balle2.setType("chance");
  Assert.assertEquals("chance", balle2.getType());
  Assert.assertNotEquals("classique", balle2.getType());
 }
 
 @Test
 public void testSetCouleur() {
  balle1.setCouleur("noir");
  Assert.assertEquals("noir", balle1.getCouleur());
  Assert.assertNotEquals("rouge", balle1.getCouleur());
 }

}