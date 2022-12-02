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
		
		//Gestion d'une liste d'adh�rents.
		ArrayList<Adherent> annuaire;
		annuaire = new ArrayList<>();
		
		// <> : op�rateur diamant.
		Adherent adh1 = new Etudiant("nomadh1","prenomAdh1","123456F","SonUniversite");
		Actif act1 = new Actif("NOmact1","Pr�nomAct1","784512E");
		Retraite ret1 = new Retraite("NomRet1","PrenomRet1","124578F");
		Etudiant etu1 = new Etudiant("Nometu1","Pr�nometu1","9996G","Universite1");
		
		annuaire.add(etu1);
		annuaire.add(ret1);
		annuaire.add(act1);
		annuaire.add(adh1);
		
		Personne pers1 = new Personne("nompers1","prenom1");
		

		//On demande l'�l�ment index� par z�ro.
		Adherent adhZero = annuaire.get(0);
		adhZero.louer( new Livre("UnLivreQuelconque"));
		
		//On peut d�clarer un etudiant en tant que personne.
		Personne pers2 = new Etudiant("nompers2","prenompers2","333A","UniversitePers2");
		//On ne peut pas demander � pers2 de louer une ressource, bien qu'il s'agisse
		//d'un �tudiant.
		
		//Comment conna�tre la nature r�elle d'un objet ?
		System.out.println( pers2.getClass().getName() );
		
		//Lorsqu'on est certain de la nature r�elle d'un objet,
		//on peut d�cider de le consid�rer comme ce qu'il est en r�alit�.
		Etudiant etu2 = (Etudiant)pers2;
		System.out.println( etu2.getUniversite() );
		
		//Impossible de cr�er une personne pour la regarder comme un �tudiant.
		//Etudiant etuZ = new Personne("NomPersonneZ", "Prenom");
		
		
		//On va envoyer une newsletter � tous les adh�rents de la m�diath�que.
		for ( Adherent adh : annuaire )
		{
			adh.envoyerNewsletter();
		}

	}

}
