package chapter06.questions.question03;

import java.util.ArrayList;
import java.util.List;

public class Question03 {

	public int methodOverloaded(int x) {
		return x;
	}

	public float methodOverloaded(float x) {
		return x;
	}

}

class SuperClass{

	CharSequence overridden(int number) {
		return new StringBuilder();
	}

	static List hidden() {
		return List.of();
	}

}

class SubClass extends SuperClass{

	@Override
	String overridden(int number) {
		return "#overridden";
	}

	static ArrayList hidden() {
		return new ArrayList();
	}

}