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
		
		//Cr�ation d'un adh�rent.
		Adherent adh1 = new Retraite("nomadh1","prenomAdh1","123456F");
		System.out.println( "Ann�e de naissance de l'adh�rent: " + adh1.getDateNaissance().getYear());
		
		//Cr�ation d'une carte pour cet adh�rent (qui est une personne).
		Carte carteAdh1 = new Carte("89012", adh1);
		
		//demander le num�ro de la carte de l'adh�rent.
		System.out.println( adh1.getCarte().getNumero() );
		
		//L'adh�rent doit louer une ressource.
		Ressource uneRessource = new Livre("Harry Potter");
		adh1.louer( uneRessource );

		//Cr�ation d'un livre.
		Livre livre1 = new Livre("Un titre de livre");
		adh1.louer(livre1);
		
		//On affiche la repr�sentation d'un objet de type Ressource
		//sous la forme d'une chaine de caract�res.
		System.out.println( uneRessource );
		System.out.println( livre1 );
		
		
		//Cr�ation d'un actif.
		Actif act1 = new Actif("NOmact1","Pr�nomAct1","784512E");
		act1.louer( new Disque("AC/DC" ));
		
		//Cr�ation d'un retrait�
		Retraite ret1 = new Retraite("NomRet1","PrenomRet1","124578F");
		ret1.louer( new Disque("Mozart"));
		
		System.out.println( ret1.getPrix() );
		
		//Cr�ation d'un �tudiant.
		Etudiant etu1 = new Etudiant("Nometu1","Pr�nometu1","9996G","Universite1");
		etu1.louer( new Livre("Les maths"));
		
		
		//On demande � l'�tudiant le num�ro de sa carte.
		try
		{
			//Affichage du 50�me caract�re du nom de l'�tudiant.
			System.out.println( etu1.getNom().charAt(2) );
			
			System.out.println("Num�ro de la carte de l'�tudiant: " + etu1.getCarte().getNumero() );
		}
		catch (NullPointerException npe)
		{
			System.out.println("L'�tudiant " + etu1 + " n'a pas de carte � pr�senter.");
		}
		catch (IndexOutOfBoundsException iobe)
		{
			System.out.println("Le nom de l'�tudiant ne contient pas suffisamment de caract�res.");
		}
		catch (Exception exc)
		{
			System.out.println("Une erreur non pr�vue s'est produite.");
		}
		
		System.out.println("Programme termin�");
		
		}
		catch (Exception exc)
		{
			System.out.println( exc.getMessage() );
		}
		
	}

}
