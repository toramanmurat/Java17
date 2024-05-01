package chapter07.questions.question26;

public enum Animals {
	 MAMMAL(true), INVERTEBRATE(Boolean.FALSE), BIRD(false),
	 
	 REPTILE(false), AMPHIBIAN(false), FISH(false) {
	 public int swim() { return 4; }
	 }; //; olmak zorunda
	 final boolean hasHair;
//	 public Animals(boolean hasHair) { enumlarin consturctorları private tanimlanmak zorundadir.
//	 this.hasHair = hasHair;
//	 }
	 private  Animals(boolean hasHair) {
		 this.hasHair = hasHair;
		 }
	 public boolean hasHair() { return hasHair; }
	 public int swim() { return 0; }
}
