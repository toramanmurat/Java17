package chapter07.understanding_polymorphism.example01;

public class Lemur extends Primate implements HasTail{

	@Override
	public boolean isTailStriped() {
		// TODO Auto-generated method stub
		return false;
	}

	public int age=10;

	public static void main(String[] args) {
		Lemur lemur=new Lemur();
		System.out.println(lemur.age);

		HasTail hasTail=lemur;
		System.out.println(hasTail.isTailStriped());

		Primate primate=lemur;
		System.out.println(primate.hasTair());
	}

}
