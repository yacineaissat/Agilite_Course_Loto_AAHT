package Loto;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BalleTest {
 protected Balle balle1 = new Balle("classique");
 protected Balle balle2 = new Balle(5, "classique");
 
 public BalleTest() {
 }

 @Before
 public void setUp() // throws java.lang.Exception
 {
  balle1 = new Balle("classique");
  balle2 = new Balle(5, "classique");
 }

 @After
 public void tearDown()
 {
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

 @Test
 public void testGetNumero() {
  Assert.assertEquals(5, balle2.getNumero());
 }

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