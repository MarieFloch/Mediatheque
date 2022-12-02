package mediatheque.metier;

public abstract class Adherent extends Personne {
	
	//Propriétés
	private String matricule;
	private double prix;
	
	//Méthodes
	
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Adherent(String unNom, String unPrenom, String unMatricule ) throws Exception
	{
		//On transmet les arguments au constructeur de la classe parente.
		//Ce constructeur sait s'en occuper.
		super(unNom, unPrenom);
		
		setMatricule( unMatricule );
		setPrix( 7.5 );	//On fixe le prix de base pour tous les adhérents.
		
	}
	
	//Méthode permettant de louer
	public Emprunt louer( Ressource res )
	{
		System.out.println("Location de " + res + " par " + this + " au prix de " + getPrix() +" €");
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + getMatricule();
	}
	
	public abstract void envoyerNewsletter() ;

}
