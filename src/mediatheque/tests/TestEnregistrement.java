package mediatheque.tests;

import java.util.ArrayList;

import mediatheque.metier.Carte;
import mediatheque.metier.Disque;
import mediatheque.metier.Livre;
import mediatheque.metier.Recordable;
import mediatheque.metier.Retraite;

public class TestEnregistrement {

	public static void main(String[] args) throws Exception {
		
		
		//Gestion d'une liste d'éléments sauvegardables.
		ArrayList<Recordable> liste = new ArrayList<>();
		
		//On place des objets dans cette liste.
		liste.add( new Disque("TitreDuDisque1"));
		liste.add( new Carte("1234", new Retraite("NomRet1","PrenomRet1","ABCD1234")));
		//liste.add(  new Livre("Titre du livre 1"));
		
		

		//Lancement de la sauvegarde.
		for ( Recordable obj : liste )
		{
			obj.save();
		}
	}

}
