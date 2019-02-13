package Loto;
import java.util.Random;

public class Balle
{
    private String type;
    private String couleur;
    private int numero;
    private Random rd;

    public Balle(String type)
    {
        rd  = new Random();
        
        this.type = type;
        if(type.equals("classique")){
            this.couleur = "rouge";
            this.numero = rd.nextInt(999)+1;
        }else {
            this.couleur = "rouge";
            this.numero = rd.nextInt(10)+1;
        }
    }
    
    public Balle(int numero, String type){
        if (type.equals("classique") && (numero > 999 || numero < 1)) throw new IllegalArgumentException ("Erreur-Veuillez saisir un nombre entre 1 et 999");
        if (type.equals("chance") && (numero > 10 || numero < 1)) throw new IllegalArgumentException ("Erreur-Veuillez saisir un nombre entre 1 et 10");
        this.type = type;
        this.couleur = "rouge";
        this.numero = numero;
    }

    
    
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean equals (Object b) {
    	return this.numero == ((Balle) b).getNumero();
    }
}