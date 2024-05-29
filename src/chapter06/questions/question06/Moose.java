package chapter06.questions.question06;

public final class Moose {
//	private final int antlers; //bir deger atilmasi gerekir.

}

class Caribou {
	private int antlers = 10;
}

class Reindeer {
	private final int antlers = 5;
}

final class Elk { //immutable
}

final class Deer { //immutable
	private final Object o = new Object();
}