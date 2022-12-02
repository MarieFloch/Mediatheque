package mediatheque.metier;

import java.time.LocalDate;
import java.time.Period;

public class Personne {
	
	//Propriétés
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	public static int ageMajorite = 18;
	private Carte carte;
	
	//Types primitifs sont accessibles quoi qu'il en soit.
	//Types complexes définis dans le package courant sont accessibles également. 
	//Types du package "java.lang" sont toujours accessibles.
	
	//Méthodes
	public Personne( String n, String p ) throws Exception
	{
		//nom = n;
		setNom( n );
		
		setPrenom(p);
		
		//La date de naissance par défaut est la date du jour.
		setDateNaissance(  LocalDate.now()   );
		
		//ageMajorite = 20;
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNom().toUpperCase() + " " + getPrenom();
	}


	public Personne(String n, String p, String dn ) throws Exception
	{
		setNom(n);
		setPrenom(p);
		
		//on prend en compte la personnalisation de la date de naissance.
		setDateNaissance(  LocalDate.parse(dn)  );
		
	}
	
	
	
	public boolean marcher() {
		
		System.out.println( prenom + " " + nom + " marche.");
		return true;
	}
	
	
	
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String propositionDeNom) {
		nom = propositionDeNom;
	}


	public String getPrenom() {
		return prenom;
	}

	
	
	
	
	
	

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	/**
	 * Permet de mettre à jour la date de naissance.
	 * 
	 * @param propositionDateNaissance
	 * doit conduire à un âge compris entre 0 et 100 ans.
	 */
	public void setDateNaissance(LocalDate propositionDateNaissance) throws Exception {
		
		//On accepte la proposition si celle-ci conduit à un âge compris dans [0, 100]
		int nbAnnees = Period.between(propositionDateNaissance, LocalDate.now()).getYears();
		if (nbAnnees < 0 ) {
			//La proposition de date est une date dans le futur.
			throw new Exception("La date de naissance d'une personne ne peut pas se situer dans le futur.");
		}
		
		if (nbAnnees > 100)
		{
			throw new Exception("Une personne ne peut pas être âgée de plus de 100 ans");
		}
		
		//On accepte la proposition de date de naissance.
		this.dateNaissance = propositionDateNaissance;
	}


	public boolean dormir( int nbHeures  ) {
		System.out.println( prenom + " " + nom + " va dormir pendant " + nbHeures + " heures.");
		return true;
	}
	
	public static int getNbAnnees( LocalDate d1, LocalDate d2  )
	{
		//On évalue la période entre les 2 dates.
		Period periode1 = Period.between(d1, d2);
		return Math.abs( periode1.getYears() );
	}
	
	public int getAge()
	{
		return Personne.getNbAnnees(getDateNaissance(), LocalDate.now());
	}


	public Carte getCarte() {
		return carte;
	}


	public void setCarte(Carte carte) {
		this.carte = carte;
	}

}








