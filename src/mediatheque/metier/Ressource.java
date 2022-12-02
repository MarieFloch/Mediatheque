package mediatheque.metier;

public abstract class Ressource {
	
	//Propri�t�s
	private String titre;

	//M�thodes
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
	
	//La repr�sentation d'une ressource sous forme de chaine est le titre de la ressource mis en majuscules.
	//Polymorphisme.
	public String toString()
	{
		return getTitre().toUpperCase();
	}

}
