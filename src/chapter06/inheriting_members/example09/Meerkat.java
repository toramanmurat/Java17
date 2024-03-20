package chapter06.inheriting_members.example09;

public class Meerkat extends Carnivore {

	protected boolean hasFur = true;

	public static void main(String[] args) {
		Meerkat m = new Meerkat();
		Carnivore c = m;
		System.out.println(m.hasFur); // true
		System.out.println(c.hasFur); // false
	}
}
