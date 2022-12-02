package mediatheque.tests;

import mediatheque.metier.Actif;
import mediatheque.metier.Adherent;
import mediatheque.metier.Carte;
import mediatheque.metier.Disque;
import mediatheque.metier.Etudiant;
import mediatheque.metier.Livre;
import mediatheque.metier.Ressource;
import mediatheque.metier.Retraite;

public class TestAdherent {

	public static void main(String[] args) {
		
		try {
		
		//Création d'un adhérent.
		Adherent adh1 = new Retraite("nomadh1","prenomAdh1","123456F");
		System.out.println( "Année de naissance de l'adhérent: " + adh1.getDateNaissance().getYear());
		
		//Création d'une carte pour cet adhérent (qui est une personne).
		Carte carteAdh1 = new Carte("89012", adh1);
		
		//demander le numéro de la carte de l'adhérent.
		System.out.println( adh1.getCarte().getNumero() );
		
		//L'adhérent doit louer une ressource.
		Ressource uneRessource = new Livre("Harry Potter");
		adh1.louer( uneRessource );

		//Création d'un livre.
		Livre livre1 = new Livre("Un titre de livre");
		adh1.louer(livre1);
		
		//On affiche la représentation d'un objet de type Ressource
		//sous la forme d'une chaine de caractères.
		System.out.println( uneRessource );
		System.out.println( livre1 );
		
		
		//Création d'un actif.
		Actif act1 = new Actif("NOmact1","PrénomAct1","784512E");
		act1.louer( new Disque("AC/DC" ));
		
		//Création d'un retraité
		Retraite ret1 = new Retraite("NomRet1","PrenomRet1","124578F");
		ret1.louer( new Disque("Mozart"));
		
		System.out.println( ret1.getPrix() );
		
		//Création d'un étudiant.
		Etudiant etu1 = new Etudiant("Nometu1","Prénometu1","9996G","Universite1");
		etu1.louer( new Livre("Les maths"));
		
		
		//On demande à l'étudiant le numéro de sa carte.
		try
		{
			//Affichage du 50ème caractère du nom de l'étudiant.
			System.out.println( etu1.getNom().charAt(2) );
			
			System.out.println("Numéro de la carte de l'étudiant: " + etu1.getCarte().getNumero() );
		}
		catch (NullPointerException npe)
		{
			System.out.println("L'étudiant " + etu1 + " n'a pas de carte à présenter.");
		}
		catch (IndexOutOfBoundsException iobe)
		{
			System.out.println("Le nom de l'étudiant ne contient pas suffisamment de caractères.");
		}
		catch (Exception exc)
		{
			System.out.println("Une erreur non prévue s'est produite.");
		}
		
		System.out.println("Programme terminé");
		
		}
		catch (Exception exc)
		{
			System.out.println( exc.getMessage() );
		}
		
	}

}
