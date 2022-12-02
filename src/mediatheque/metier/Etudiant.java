package mediatheque.metier;

public class Etudiant extends Adherent {
	
	private String universite;

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return super.getPrix() * 0;
	}

	public Etudiant(String unNom, String unPrenom, String unMatricule, String uneUniversite) throws Exception {
		super(unNom, unPrenom, unMatricule);
		setUniversite( uneUniversite );
	}

	public String getUniversite() {
		return universite;
	}

	public void setUniversite(String universite) {
		this.universite = universite;
	}

	@Override
	public void envoyerNewsletter() {
		// TODO Auto-generated method stub
		System.out.println("Envoi d'infos concernant les universités et les écoles");
	}

}
