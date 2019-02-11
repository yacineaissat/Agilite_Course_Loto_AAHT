package Loto;

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
    	String s = "La liste des courreurs est ";
    	
    	for (Balle balle : tirage) {
    		s += balle.getNumero()+ " ";
    	}

    	System.out.println(s);
    }
    
    /*private boolean evaluer(Balle[] jeu){
        for (int i=0; i<6; i++){
            if (! jeu[i].equals(tirage[i])) return false;
        }
        return true;
    }*/
    
    
    public Balle[] getTirage()
    {
        return tirage;
    }
    
    public String getCouleur()
    {
        return couleur;
    }

}
