package ex3;
public class Zoo {

	private String nom;
	public SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	 
	
	public void addAnimal(Animal animal){
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);
		}
		else if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.equals("REPTILE")){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.equals("POISSON")){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}