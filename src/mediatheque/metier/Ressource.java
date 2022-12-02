package mediatheque.metier;

public abstract class Ressource {
	
	//Propriétés
	private String titre;

	//Méthodes
	public Ressource( String t )
	{
		setTitre(t);
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	//La représentation d'une ressource sous forme de chaine est le titre de la ressource mis en majuscules.
	//Polymorphisme.
	public String toString()
	{
		return getTitre().toUpperCase();
	}

}
