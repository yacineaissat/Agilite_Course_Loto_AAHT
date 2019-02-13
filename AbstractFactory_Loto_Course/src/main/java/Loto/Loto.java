package Loto;

import java.util.Collections;

public class Loto extends AbstractJoueur
{
    private Balle [] tirage = new Balle[6];
    private String couleur;

    
    public Loto(String couleur)
    {
        for (int i=0; i<6; i++){
            tirage[i] = new Balle("classique");
        }
        this.couleur = couleur;
    }

    public int calculerGain(Balle [] jeu)
    {
    	int gain = 0;
    	for (int i=0; i<6; i++){
    		//Le gain augmente pour chaque coureur bien classé
            if ( jeu[i].equals(tirage[i])) gain += (i+1)*2000;
            // Jackpot si tous les coureurs dans le bon ordre
            if (gain==42000) gain=gain+100000;
        }
        return gain;
    }
    
    public void afficherCoureurs() {
    	String s = "La liste des coureurs est ";
    	
    	s += tirage[1].getNumero()+ " "+
    	tirage[3].getNumero()+ " "+
    	tirage[0].getNumero()+ " "+
    	tirage[4].getNumero()+ " "+
    	tirage[5].getNumero()+ " "+
    	tirage[2].getNumero()+ " ";
    	
    	

    	System.out.println(s);
    }
    
    public Balle[] getTirage()
    {
        return tirage;
    }
    
    public String getCouleur()
    {
        return couleur;
    }

}