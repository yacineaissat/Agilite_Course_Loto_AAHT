package Loto;
import Observer.*;

import java.util.Scanner;

public class Joueur extends CourseObserver
{
	private String ballesAJouer;
	private Balle [] jeu = new Balle [6];
    private Loto loto;
    private static int idJoueur = 0;
    private int id;
    
    public Joueur()
    {
    	id = idJoueur;
    	idJoueur += 1;
    	for (int i = 1; i<6;i++) {
    		jeu[i] = new Balle(i+1,"aleatoire");
    	}
    	
    }
    
    public Joueur(int test)
    {
    	id = idJoueur;
    	idJoueur += 1;
    	for (int i = 1; i<6;i++) {
    		jeu[i] = new Balle("classique");
    	}
    	
    }
    
    public Balle[] creerJeu(Balle[] tirage) {
	    ballesAJouer = "";
	    
	    for (Balle b : tirage) {
	    	ballesAJouer += " " + b.getNumero();
	    }
	    
	    //Inversion de l'affichage
	    String ballesAAfficher = "";
	    ballesAAfficher = ballesAJouer.substring(4)+ballesAJouer.substring(0,4);
	    
	    System.out.println("Voici les numéros de dossards des coureurs : " + ballesAAfficher);
	    
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
	    
	    /*System.out.println("Veuillez saisir un numéro chance entre 1 et 10 :");
	    int i=0;
	    while (i==0){
	        try {
	            jeu[5] = new Balle(sc.nextInt(), "chance");
	            i++;
	            System.out.println("Vous avez saisi : " + jeu[5].getNumero());
	             
	        }catch (Exception e){
	            System.out.println (e.getMessage());
	        }
	    }*/
	    sc.close();
	    return jeu;
    }
    
    public Balle [] getJeu() {
    	return this.jeu;
    }

	@Override
	public void jouer() {
		while (! CourseObserver.jouer) {}
		this.jeu = creerJeu(CourseObserver.coureurs);
	}

	@Override
	public void calculerGain(Balle[] resultat) {
		System.out.println("Le joueur " + id + " a gagné " + Loto.calculerGain(jeu, resultat) + " pièces d'or.");
		System.out.println("L'ordre d'arrivée des joueurs est " + ballesAJouer);
		System.out.println("N'hésitez pas à retenter votre chance à la prochaine course");
	}
	
	
	 public static int getIdJoueur() {
		return idJoueur;
	}

	public static void setIdJoueur(int idJoueur) {
		Joueur.idJoueur = idJoueur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Balle[] creerJeu(Balle[] tirage, int test) {
		 if (test ==0) {   
			jeu = new Balle[6]; 
		    for (int i=0;i<6;i++) {
		    	jeu[i] = new Balle(tirage[i].getNumero(), "classique");
		    }
		    return jeu; 
		 }
		 return null;
	 }
}
