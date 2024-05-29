package ex3;
import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore {

	private List<Animal> animaux = new ArrayList<>();

	
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}