package Loto;

/**
 * Décrivez votre classe Joueur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
import java.util.Scanner;

public class Joueur extends AbstractJoueur
{
    private Balle [] jeu = new Balle [6];
    private Loto loto;
    
    public Joueur()
    {
    	loto = new Loto("rouge");
    	for (int i = 1; i<6;i++) {
    		jeu[i] = new Balle(i+1,"aleatoire");
    	}
    	
    }
    
    public Balle[] creerJeu() {
    // initialisation des variables d'instance
    Scanner sc = new Scanner(System.in);
    for (int i=0;i<6;i++){
    System.out.println("Veuillez saisir un numéro entre 1 et 49 :");
        try {
            jeu[i] = new Balle(sc.nextInt(), "classique");
            //System.out.println("Vous avez saisi : " + jeu[i].getNumero());
        } catch (Exception e){
            i--;
            System.out.println(e.getMessage());
        }
    }
    /*System.out.println("Veuillez saisir un numéro chance entre 1 et 10 :");
    int i=0;
    while (i==0){
        try {
            jeu[5] = new Balle(sc.nextInt(), "chance");
            i++;
            //System.out.println("Vous avez saisi : " + jeu[5].getNumero());
        }catch (Exception e){
            System.out.println (e.getMessage());
        }
    }*/
    sc.close();
    return jeu;
    }
    
    public int calculerGain(){
     return loto.calculerGain(this.jeu); 
    }

    public Balle [] getJeu() {
    	return this.jeu;
    }
}
