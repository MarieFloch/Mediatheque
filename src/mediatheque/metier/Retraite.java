package mediatheque.metier;

public class Retraite extends Adherent {

	public Retraite(String unNom, String unPrenom, String unMatricule) throws Exception {
		super(unNom, unPrenom, unMatricule);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setPrix(double prix) {
		// TODO Auto-generated method stub
		super.setPrix(prix);
	}

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return super.getPrix() / 2;
	}

	@Override
	public void envoyerNewsletter() {
		// TODO Auto-generated method stub
		System.out.println("Envoi d'infos sur les voyages");
	}

	
	
}
