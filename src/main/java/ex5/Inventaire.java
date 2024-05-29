package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets"));
		caisses.add(new Caisse("Moyens objets"));
		caisses.add(new Caisse("Grands objets"));
	}

	public void addItem(Item item) {
		// absolument pas sûre, ce n'est pas lisible...
		boolean essai = (item.getPoids() < 5) ? caisses.get(0).getItems().add(item) : (item.getPoids() >= 5 && item.getPoids() <= 20) ? caisses.get(1).getItems().add(item) : (item.getPoids() >= 20) ? caisses.get(2).getItems().add(item) : false; 
				
	}

	public int taille() {

		// TODO faites évoluer ce code.
		int taille = 0;
		for (int i = 0; i<caisses.size(); i++) {
			 taille += caisses.get(i).getItems().size();
		}
		return taille;
		
	}
}
