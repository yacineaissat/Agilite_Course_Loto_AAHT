package Course;

import java.util.ArrayList;

import Loto.*;
import Observer.*;


public class Course {
	private String lieu;
	private int tour;
	private ArrayList<CourseObserver> listeObservateurs;
	private Balle[] resultat;

	
	public Course(String lieu, int tour) {
		// initialisation des variables d'instance
		this.lieu = lieu;
		this.tour = tour;
		this.listeObservateurs = new ArrayList();
	}

	
	public void addObserver( CourseObserver co) {
		this.listeObservateurs.add(co);
	}
	
	public void setLieu(String y) {
		this.lieu = y;
	}

	public String getLieu() {
		return lieu;
	}

	public void setTour(int y) {
		this.tour = y;
	}

	public int getTour() {
		return tour;
	}

	public int ajoutTour(int y) {
		return this.tour = this.tour + y;
	}

	public void notifyObs() {
		for (CourseObserver obs: listeObservateurs) {
			obs.jouer();
		}
	}
	
	public void calculerGains() {
		for (CourseObserver obs: listeObservateurs) {
			obs.calculerGain(resultat);
		}
	}
	
	public void jouer() {
		notifyObs();
		calculerGains();
	}
	
	public void setResultat (Balle [] resultat ) {
		this.resultat = resultat;
	}
}
