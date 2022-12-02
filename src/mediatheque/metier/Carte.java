package mediatheque.metier;

public class Carte implements Recordable {
	
	//Propri�t�s
	private String numero;
	private Personne proprietaire;
	
	//M�thodes
	
	
	/**
	 * Ce constructeur initialise une carte
	 * avec un num�ro et un propri�taire.
	 * La carte est automatiquement mise dans la poche de son propri�taire.
	 *  
	 * 
	 * @param propositionDeNumero
	 * Il doit s'agir d'un num�ro commen�ant par ABCDEF.
	 * 
	 * @param propositionDeProprietaire
	 * Il doit s'agir d'un propri�taire majeur ( �ge >= 18 ans)
	 */
	public Carte( String propositionDeNumero, Personne propositionDeProprietaire)
	{
		setNumero(propositionDeNumero);
		setProprietaire(propositionDeProprietaire);
		
		//On donne la carte � son propri�taire.
		getProprietaire().setCarte( this );
	}
	
	public String getNumero() {
		return numero;
	}
	
	private void setNumero(String numero) {
		//Acc�s � la base de donn�es pour v�rifier que le num�ro n'a pas �t� attribu�.
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
		
		//Sauvegarde r�elle � impl�menter.
		//...
		
		return true;
	}
	
	
	
}
