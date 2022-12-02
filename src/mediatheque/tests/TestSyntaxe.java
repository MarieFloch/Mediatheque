package mediatheque.tests;

import java.time.LocalTime;

public class TestSyntaxe {
	
	//Définition d'une fonction qui affiche l'heure courante.
	public static void afficherHeureCourante()
	{
		System.out.println("*********************");
		System.out.println( LocalTime.now() );
		System.out.println("*********************");
	}
	
	
	private boolean test;

	public static void main(String[] args) {
		
		//Déclaration d'une variable.
		//Variable locale à la méthode main.
		int compteur;
		
		//Affectation d'une valeur à la variable
		compteur = 120;
		
		//Création d'une variable et affectation directe.
		String message = "Bienvenue dans ce cours";
		
		//Notion de type.
		//Huit types primitifs: int, long, double, float, char, boolean, byte, short
		//Infinité de types complexes: String, System, LocalDate, Boolean, ...
		
		//Affichage d'un message dans la console.
		System.out.println( message );
		
		//Création d'une constante.
		final String MOISCOURANT = "Novembre";
		//Impossible de changer la valeur dune constante. MOISCOURANT = "Décembre";
		
		//Déclaration d'une variable booléenne.
		boolean succes = false;
		
		
		//Réalisation de tests
		if ( compteur > 100 &&  (! succes) )
		{
			System.out.println( "Le compteur a une valeur importante: "  + compteur );
		}
		else
		{
			System.out.println( "Le compteur a une valeur faible.");
		}
		
		//Opérateurs de comparaison: >, <, >=, <=, !=, ==, !
		//Opérateurs logiques: && (ET) || (OU)
		
		//Traitements itératifs
		//1. On connait à l'avance le nombre d'itérations.
		//On veut afficher le double de toutes les valeurs comprises entre 100 et 200, par pas de 3.
		for ( int i=100    ;  i<=200    ;  i=i+3  )
		{
			System.out.println( i * 2 );
		}
		
		
		//2. On ne connait pas à l'avance le nombre d'itérations.
		//Eventuellement, on ne passera jamais dans le processus itératif.
		double valeurImportante = 12345678;
		
		while ( valeurImportante >= 4 )
		{
			System.out.println( valeurImportante );
			valeurImportante = valeurImportante / 3.14;
		}
		
		
		//3. On ne connait pas à l'avance le nombre d'itérations.
		//On est certain de passer au moins une fois dans la boucle.
		do
		{
			System.out.println( "---- " + valeurImportante);
			valeurImportante--; 
		}
		while ( valeurImportante > -36  );
		
		
		//Traitement au cas par cas.
		int mois = 5;
		
		switch (  mois  )
		{
			case 1:
			case 3:
			case 5:
				System.out.println("31 jours");
				break;
			case 4:
				System.out.println("30 jours");
				break;
			default:
				System.out.println("Nombre de jours inconnu");
		}
		
		
		//Manipulation de tableaux de notes d'élèves
		double[] notes = new double[ 20 ];
		notes[ 4 ] = 12.5;	//Affectation d'une note à l'élève indexé par 4.
		notes[ 12 ] = 7.5;
		
		System.out.println("Element d'index 8: " + notes[ 8 ]);
		
		//Affichage de toutes les notes.
		//for ( int index=0 ; index < notes.length ; index++)
		for ( double uneDesNotes  : notes )
		{
			System.out.println( uneDesNotes );
		}
		
		//Tableau à double entrée (matrice)
		//Ici, on définit un tableau "annuaire" pour le stockage des adhérents.
		//10 adhérents au max; 4 propriétés par adhérent.
		String[][] annuaire = new String[10][4];
		annuaire[8][0] = "NOM7";
		annuaire[9][2] = "08/01/1991";
		
		//Affichage le prénom de l'adhérent situé au rang 5.
		System.out.println( annuaire[5][1] );
		
		
		//Appel de fonctions.
		afficherHeureCourante();
		
		double laSomme = additionner(12,13);
		System.out.println( laSomme );
		
		double unTotal = additionner(notes);
		System.out.println("La somme des notes vaut " + unTotal);
		
	}
	
	public static double additionner( double a, double b )
	{
		return a + b;
	}
	

	//Fonction qui évalue le total des valeurs d'un tableau.
	public static double additionner( double[] leTableau )
	{
		double total = 0;
		
		for ( double uneValeur  : leTableau)
		{
			total = total + uneValeur;
		}
		
		return total;
	}

}
