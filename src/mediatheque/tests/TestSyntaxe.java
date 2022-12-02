package mediatheque.tests;

import java.time.LocalTime;

public class TestSyntaxe {
	
	//D�finition d'une fonction qui affiche l'heure courante.
	public static void afficherHeureCourante()
	{
		System.out.println("*********************");
		System.out.println( LocalTime.now() );
		System.out.println("*********************");
	}
	
	
	private boolean test;

	public static void main(String[] args) {
		
		//D�claration d'une variable.
		//Variable locale � la m�thode main.
		int compteur;
		
		//Affectation d'une valeur � la variable
		compteur = 120;
		
		//Cr�ation d'une variable et affectation directe.
		String message = "Bienvenue dans ce cours";
		
		//Notion de type.
		//Huit types primitifs: int, long, double, float, char, boolean, byte, short
		//Infinit� de types complexes: String, System, LocalDate, Boolean, ...
		
		//Affichage d'un message dans la console.
		System.out.println( message );
		
		//Cr�ation d'une constante.
		final String MOISCOURANT = "Novembre";
		//Impossible de changer la valeur dune constante. MOISCOURANT = "D�cembre";
		
		//D�claration d'une variable bool�enne.
		boolean succes = false;
		
		
		//R�alisation de tests
		if ( compteur > 100 &&  (! succes) )
		{
			System.out.println( "Le compteur a une valeur importante: "  + compteur );
		}
		else
		{
			System.out.println( "Le compteur a une valeur faible.");
		}
		
		//Op�rateurs de comparaison: >, <, >=, <=, !=, ==, !
		//Op�rateurs logiques: && (ET) || (OU)
		
		//Traitements it�ratifs
		//1. On connait � l'avance le nombre d'it�rations.
		//On veut afficher le double de toutes les valeurs comprises entre 100 et 200, par pas de 3.
		for ( int i=100    ;  i<=200    ;  i=i+3  )
		{
			System.out.println( i * 2 );
		}
		
		
		//2. On ne connait pas � l'avance le nombre d'it�rations.
		//Eventuellement, on ne passera jamais dans le processus it�ratif.
		double valeurImportante = 12345678;
		
		while ( valeurImportante >= 4 )
		{
			System.out.println( valeurImportante );
			valeurImportante = valeurImportante / 3.14;
		}
		
		
		//3. On ne connait pas � l'avance le nombre d'it�rations.
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
		
		
		//Manipulation de tableaux de notes d'�l�ves
		double[] notes = new double[ 20 ];
		notes[ 4 ] = 12.5;	//Affectation d'une note � l'�l�ve index� par 4.
		notes[ 12 ] = 7.5;
		
		System.out.println("Element d'index 8: " + notes[ 8 ]);
		
		//Affichage de toutes les notes.
		//for ( int index=0 ; index < notes.length ; index++)
		for ( double uneDesNotes  : notes )
		{
			System.out.println( uneDesNotes );
		}
		
		//Tableau � double entr�e (matrice)
		//Ici, on d�finit un tableau "annuaire" pour le stockage des adh�rents.
		//10 adh�rents au max; 4 propri�t�s par adh�rent.
		String[][] annuaire = new String[10][4];
		annuaire[8][0] = "NOM7";
		annuaire[9][2] = "08/01/1991";
		
		//Affichage le pr�nom de l'adh�rent situ� au rang 5.
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
	

	//Fonction qui �value le total des valeurs d'un tableau.
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
