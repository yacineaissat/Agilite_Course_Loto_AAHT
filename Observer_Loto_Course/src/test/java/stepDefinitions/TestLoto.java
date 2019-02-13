package stepDefinitions;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;

import Loto.*;
public class TestLoto {

	Joueur joueur;
	Loto tirage = new Loto("rouge");

	@Given("^joueur$")
	public void joueur() throws Throwable {
		joueur = new Joueur();
		if (joueur == null) throw new PendingException();
	}

	@When("^Je choisis un jeu de (\\d+) boules$")
	public void je_choisis_un_jeu_de_boules(int arg1) throws Throwable {
		 joueur.creerJeu(tirage.getTirage(), 0);
		 Balle [] tab = joueur.getJeu();
		  for (int i=0; i<6; i++) {
			  tab[i]=new Balle("classique");
			 if (tab[i] == null) throw new PendingException();
		  }
	}

	@Then("^Je veux avoir mon gain$")
	public void je_veux_avoir_mon_gain() throws Throwable {
		System.out.println("Le gain du joueur est : "+Loto.calculerGain(joueur.getJeu(), tirage.getTirage()));
	}

	@Then("^(\\d+) sinon$")
	public void sinon(int arg1) throws Throwable {
	    System.out.println("");
	    if (joueur == null) throw new PendingException();
	}

}

