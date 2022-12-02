package mediatheque.tests;

import java.time.LocalDate;

import mediatheque.metier.Carte;
import mediatheque.metier.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		try {
		//Cr�er un objet issu de la classe Personne.
		Personne p1;
		p1 = new Personne("dupond","marie");
		
		//Initialisation de l'objet p1 avec des donn�es adapt�es.
		//p1.setNom("nomp1");
		//p1.setPrenom("pr�nomP1");
		p1.setDateNaissance(  LocalDate.parse("2023-11-09")  );
		
		
		
		//On demande � p1 de marcher et dormir.
		p1.marcher();
		p1.dormir( 4 );
		
		
		//Cr�ation d'une deuxi�me personne.
		Personne p2 = new Personne("durand","Jacques","1983-06-20");
		p2.dormir( 12 );
		
		
		//Evaluation du nombre d'ann�es entre le 18/05/2004 et le 17/11/1918.
		//On appelle une m�thode statique en nommant la classe pour atteindre la m�thode en question.
		int nbAnnees = Personne.getNbAnnees(  LocalDate.parse("2004-05-18") , LocalDate.parse("1918-11-17") );
		System.out.println( nbAnnees );
		
		
		//Afficher l'�ge de p1.
		int age = Personne.getNbAnnees( p1.getDateNaissance() , LocalDate.now() );
		
		age = p1.getAge();
		
		System.out.println( age + " ans.");
		// op�rateur + : arithm�tique sauf si l'un (ou les 2) des op�randes est une chaine de caract�res.
		// si l'autre op�rande n'est pas une cha�ne, il y a une tentative de conversion en chaine de caract�res.
		
		
		//Cr�ation d'une carte dont le propri�taire est p2.
		Carte carte2 = new Carte("123ABC", p2);
		
		//Afficher le pr�nom du propri�taire de carte2.
		System.out.println("Le pr�nom du propri�taire de p2 est: " + carte2.getProprietaire().getPrenom() );
		
		//Afficher le num�ro de la carte qui est dans la poche de p2.
		System.out.println( p2.getCarte().getNumero() );
		
		
		//Cr�ation d'une autre carte pour l'affecter � p1.
		Carte carte1 = new Carte("456DEF", p1);
		}
		catch (Exception exc)
		{
			System.out.println( exc.getMessage() );
		}
		
	}

}
