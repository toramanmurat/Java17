package chapter09.sorting_data.example08;

public class Squirrel {

	private int weight;
	private String species;
	public Squirrel(int weight, String species) {
		super();
		this.weight = weight;
		this.species = species;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "Squirrel [weight=" + weight + ", species=" + species + "]";
	}
	
	
	
	
}
