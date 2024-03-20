package chapter05.questions.question12;

public class Question12 {

	public void feed() {
		int monkey = 0;
		if (monkey > 0) {
			var giraffe = monkey++; //effectively final
			String name; //effectively final
			name = "geoffrey";
		}
		String name = "milly";
		var food = 10;
		while (monkey <= 10) {
			food = 0;
		}
		name = null;
	}

}


// effectively final --> bir degiskenin basina final ifadesini koydugumuzda hata almiyorsak(derleniyorsa) effectively final'dir'