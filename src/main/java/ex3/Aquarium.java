package ex3;
import java.util.List;

public class Aquarium {

	private List<Animal> animaux;
	
	
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.2;
	}
}