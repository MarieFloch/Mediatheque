package mediatheque.metier;

public class Actif extends Adherent {

	public Actif(String unNom, String unPrenom, String unMatricule) throws Exception {
		super(unNom, unPrenom, unMatricule);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void envoyerNewsletter() {
		// TODO Auto-generated method stub
		System.out.println( "Envoi d'infos sur les entreprises");
	}

}
