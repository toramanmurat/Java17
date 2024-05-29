package chapter06.inheriting_members.example01;

public class Kangaroo extends Marsupial {
	@Override
	public double getAverageWeight() {
		return super.getAverageWeight() + 20;
	}

	public static void main(String[] args) {
		System.out.println(new Marsupial().getAverageWeight()); // 50.0
		System.out.println(new Kangaroo().getAverageWeight()); // 70.0
	}

}
