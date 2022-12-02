package mediatheque.metier;

public class Carte implements Recordable {
	
	//Propriétés
	private String numero;
	private Personne proprietaire;
	
	//Méthodes
	
	
	/**
	 * Ce constructeur initialise une carte
	 * avec un numéro et un propriétaire.
	 * La carte est automatiquement mise dans la poche de son propriétaire.
	 *  
	 * 
	 * @param propositionDeNumero
	 * Il doit s'agir d'un numéro commençant par ABCDEF.
	 * 
	 * @param propositionDeProprietaire
	 * Il doit s'agir d'un propriétaire majeur ( âge >= 18 ans)
	 */
	public Carte( String propositionDeNumero, Personne propositionDeProprietaire)
	{
		setNumero(propositionDeNumero);
		setProprietaire(propositionDeProprietaire);
		
		//On donne la carte à son propriétaire.
		getProprietaire().setCarte( this );
	}
	
	public String getNumero() {
		return numero;
	}
	
	private void setNumero(String numero) {
		//Accès à la base de données pour vérifier que le numéro n'a pas été attribué.
		this.numero = numero;
	}
	
	public Personne getProprietaire() {
		return proprietaire;
	}
	
	private void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}

	@Override
	public boolean save() throws Exception {
		System.out.println("Sauvegarde de la carte " + this + " dans le fichier cartes.csv");
		
		//Sauvegarde réelle à implémenter.
		//...
		
		return true;
	}
	
	
	
}
