package stepDefinitions;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

import static org.junit.Assert.assertEquals;

import Loto.*;
import Observer.*;
public class TestLoto {


	int i = 0;
	Joueur joueur;
	Loto tirage = new Loto("rouge");

	@Given("^joueur$")
	public void joueur() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		joueur = new Joueur();
		if (joueur == null) throw new PendingException();
	}

	@When("^Je choisis un jeu de (\\d+) boules$")
	public void je_choisis_un_jeu_de_boules(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 joueur.creerJeu(tirage.getTirage(), 0);
		 Balle [] tab = joueur.getJeu();
		  for (int i=0; i<6; i++) {
			 if (tab[i] == null) throw new PendingException();
		  }
	}

	@Then("^Je veux avoir mon gain$")
	public void je_veux_avoir_mon_gain() throws Throwable {
		System.out.println("Le gain du joueur est : "+Loto.calculerGain(joueur.getJeu(), tirage.getTirage()));
	}

	@Then("^(\\d+) sinon$")
	public void sinon(int arg1) throws Throwable {
	    if(i==0) System.out.println("");
	    else throw new PendingException();
	}

	@Given("^Le joueur choisit un jeu de (\\d+) boules$")
	public void le_joueur_choisit_un_jeu_de_boules(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(i==0) System.out.println("joue4");
		else throw new PendingException();
	}

	@When("^Le gain calculé est négatif$")
	public void le_gain_calculé_est_négatif() throws Throwable {
		assert (Loto.calculerGain(tirage.getTirage(), joueur.getJeu()) >= 0);
	}

	@Then("^Le système refuse le gain négatif$")
	public void le_système_refuse_le_gain_négatif() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(i==0) System.out.println("joue6");
		else throw new PendingException();
	}
	
	@Given("^jeu$")
	public void jeu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Le jeu est enregistré$")
	public void le_jeu_est_enregistré() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Le système renvoie le jeu$")
	public void le_système_renvoie_le_jeu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}

