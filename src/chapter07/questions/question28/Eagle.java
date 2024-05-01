package chapter07.questions.question28;

public class Eagle {
//	abstract soar();
}

 abstract class Camel {
//	void travel();
	abstract void travel();
}

 interface EatsGrass {
//	private abstract int chew(); //interface abstract metodlari private olarak tanimlanamaz.
	abstract int chew();
}

 abstract class Elephant {
	abstract private class SleepsAlot {
		abstract int sleep();
	}
}

 interface Spider { default void crawl() {} }