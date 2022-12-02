package mediatheque.tests;

import java.time.LocalDate;

import mediatheque.metier.Carte;
import mediatheque.metier.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		try {
		//Créer un objet issu de la classe Personne.
		Personne p1;
		p1 = new Personne("dupond","marie");
		
		//Initialisation de l'objet p1 avec des données adaptées.
		//p1.setNom("nomp1");
		//p1.setPrenom("prénomP1");
		p1.setDateNaissance(  LocalDate.parse("2023-11-09")  );
		
		
		
		//On demande à p1 de marcher et dormir.
		p1.marcher();
		p1.dormir( 4 );
		
		
		//Création d'une deuxième personne.
		Personne p2 = new Personne("durand","Jacques","1983-06-20");
		p2.dormir( 12 );
		
		
		//Evaluation du nombre d'années entre le 18/05/2004 et le 17/11/1918.
		//On appelle une méthode statique en nommant la classe pour atteindre la méthode en question.
		int nbAnnees = Personne.getNbAnnees(  LocalDate.parse("2004-05-18") , LocalDate.parse("1918-11-17") );
		System.out.println( nbAnnees );
		
		
		//Afficher l'âge de p1.
		int age = Personne.getNbAnnees( p1.getDateNaissance() , LocalDate.now() );
		
		age = p1.getAge();
		
		System.out.println( age + " ans.");
		// opérateur + : arithmétique sauf si l'un (ou les 2) des opérandes est une chaine de caractères.
		// si l'autre opérande n'est pas une chaîne, il y a une tentative de conversion en chaine de caractères.
		
		
		//Création d'une carte dont le propriétaire est p2.
		Carte carte2 = new Carte("123ABC", p2);
		
		//Afficher le prénom du propriétaire de carte2.
		System.out.println("Le prénom du propriétaire de p2 est: " + carte2.getProprietaire().getPrenom() );
		
		//Afficher le numéro de la carte qui est dans la poche de p2.
		System.out.println( p2.getCarte().getNumero() );
		
		
		//Création d'une autre carte pour l'affecter à p1.
		Carte carte1 = new Carte("456DEF", p1);
		}
		catch (Exception exc)
		{
			System.out.println( exc.getMessage() );
		}
		
	}

}
