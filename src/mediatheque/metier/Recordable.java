package mediatheque.metier;


public interface Recordable {
	
	//Une interface est - par définition - une liste de méthodes abstraites.
	public boolean save() throws Exception;
	
}
