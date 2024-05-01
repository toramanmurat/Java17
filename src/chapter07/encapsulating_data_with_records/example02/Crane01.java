package chapter07.encapsulating_data_with_records.example02;

public final class Crane01 {
	
	private final int numberEggs;
	private final String name;
	
	public Crane01(int numberEggs,String name) {
		if(numberEggs>=0) { 
			this.numberEggs=numberEggs; //guard condition
		}
		else {
			throw new IllegalArgumentException();
		}
		
		this.name=name;
	}

	public int getNumberEggs() { //getter
		return numberEggs;
	}

	public String getName() { //getter
		return name;
	}

	@Override
	public String toString() {
		return "Crane [numberEggs=" + numberEggs + ", name=" + name + "]";
	}
	
	
	
	

}
