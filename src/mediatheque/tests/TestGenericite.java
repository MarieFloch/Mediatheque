package mediatheque.tests;

import java.util.ArrayList;

import mediatheque.metier.Actif;
import mediatheque.metier.Adherent;
import mediatheque.metier.Etudiant;
import mediatheque.metier.Livre;
import mediatheque.metier.Personne;
import mediatheque.metier.Retraite;

public class TestGenericite {

	public static void main(String[] args) throws Exception {
		
		//Gestion d'une liste d'adhérents.
		ArrayList<Adherent> annuaire;
		annuaire = new ArrayList<>();
		
		// <> : opérateur diamant.
		Adherent adh1 = new Etudiant("nomadh1","prenomAdh1","123456F","SonUniversite");
		Actif act1 = new Actif("NOmact1","PrénomAct1","784512E");
		Retraite ret1 = new Retraite("NomRet1","PrenomRet1","124578F");
		Etudiant etu1 = new Etudiant("Nometu1","Prénometu1","9996G","Universite1");
		
		annuaire.add(etu1);
		annuaire.add(ret1);
		annuaire.add(act1);
		annuaire.add(adh1);
		
		Personne pers1 = new Personne("nompers1","prenom1");
		

		//On demande l'élément indexé par zéro.
		Adherent adhZero = annuaire.get(0);
		adhZero.louer( new Livre("UnLivreQuelconque"));
		
		//On peut déclarer un etudiant en tant que personne.
		Personne pers2 = new Etudiant("nompers2","prenompers2","333A","UniversitePers2");
		//On ne peut pas demander à pers2 de louer une ressource, bien qu'il s'agisse
		//d'un étudiant.
		
		//Comment connaître la nature réelle d'un objet ?
		System.out.println( pers2.getClass().getName() );
		
		//Lorsqu'on est certain de la nature réelle d'un objet,
		//on peut décider de le considérer comme ce qu'il est en réalité.
		Etudiant etu2 = (Etudiant)pers2;
		System.out.println( etu2.getUniversite() );
		
		//Impossible de créer une personne pour la regarder comme un étudiant.
		//Etudiant etuZ = new Personne("NomPersonneZ", "Prenom");
		
		
		//On va envoyer une newsletter à tous les adhérents de la médiathèque.
		for ( Adherent adh : annuaire )
		{
			adh.envoyerNewsletter();
		}

	}

}
