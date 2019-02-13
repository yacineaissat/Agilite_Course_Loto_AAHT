package Loto;

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
    System.out.println("Veuillez choisir le coureur que vous classez à la place : "+(i+1));
        try {
            jeu[i] = new Balle(sc.nextInt(), "classique");
        } catch (Exception e){
            i--;
            System.out.println(e.getMessage());
        }
    }
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