package chapter06.questions.question22;

public class Child extends Person {
	static String name;

	@Override
	void setName(String w) {
		name = w;
	}

	public static void main(String[] p) {
		final Child m = new Child();
		final Person t = m;
		Child.name = "Elysia";
		Person.name = "Sophia";
		m.setName("Webby");
		t.setName("Olivia");
		System.out.println(Child.name + " " + Person.name);
	}

}

//Olivia Sophia