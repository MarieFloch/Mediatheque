package mediatheque.metier;

public class Disque extends Ressource implements Recordable {

	public Disque(String t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save() throws Exception {
		System.out.println("Sauvegarde du disque " + this + " dans la base de données mediatheque.db");
		return false;
	}

}
