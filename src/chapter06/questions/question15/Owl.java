package chapter06.questions.question15;

public class Owl extends Nocturnal {

	@Override
	public boolean isBlind() {
		return false;
	}

	public static void main(String[] args) {
		var nocturnal = (Nocturnal) new Owl();
		System.out.println(nocturnal.isBlind());
	}

}


//C ok. Not Compile line2