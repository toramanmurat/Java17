package chapter07.understanding_polymorphism.example05;

public class EmperorPenguin extends Penguin {

	@Override
	public int getHeight() {
		return 8;
	}

	public static void main(String[] args) {
		new EmperorPenguin().printInfo();
	}
}

// 8