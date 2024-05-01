package chapter07.questions.question30;

public sealed class Bird {
	public final class Flamingo extends Bird {
	}
}

sealed class Monkey {
}

final class EmperorTamarin extends Monkey { //sealed, non-slead yada final
}

non-sealed class Mandrill extends Monkey {
}

sealed class Friendly extends Mandrill permits Silly {
}

final class Silly extends Friendly{ // extends etmesi gerekiyor.
}