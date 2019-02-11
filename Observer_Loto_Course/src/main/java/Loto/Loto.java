package Loto;
import Observer.*;

public class Loto extends CourseObserver
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

    public static int calculerGain(Balle [] jeu, Balle [] resultat)
    {
    	int gain = 0;
    	int compteBonsClassements = 0;
    	for (int i=0; i<6; i++){
    		//Le gain augmente pour chaque coureur bien classé
            if ( jeu[i].equals(resultat[i])) gain += (i+1)*2000;
            compteBonsClassements++;
            // Jackpot si tous les coureurs dans le bon ordre
            if (gain==42000) gain=gain+100000;
        }
        return gain;
    }
    
    
    public Balle[] getTirage()
    {
      
        return tirage;
    }
    
    public String getCouleur()
    {
      
        return couleur;
    }

	public void jouer() {
		// TODO Auto-generated method stub
		for (int i=0; i<6; i++){
            tirage[i] = new Balle("classique");
        }
        //tirage[5] = new Balle("chance");
        this.couleur = couleur;
        CourseObserver.coureurs = tirage;
        update(tirage);
        CourseObserver.jouer = true;
	}


	@Override
	public void calculerGain(Balle[] resultat) {
	}

}
