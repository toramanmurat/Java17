package chapter06.questions.question09;

public class Question09 {

}

class SuperClass {
	void overLoaded(Number number) {

	}

	void overridden(Number number) {
	}
}

class SubClass extends SuperClass{

	void overLoaded(Integer number) {

	}

	@Override
	void overridden(Number number) throws IllegalArgumentException {

	}
}

//overloaded metodlarda paramatre degisirken overridden metodlarda parametre degismez.