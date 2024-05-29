package chapter08.using_method_references.example01;



public class Duckling {

	public static void makeSound(String sound) {
		LearnToSpeak learner= s-> System.out.println(s);
		DuckHelper.teacher(sound, learner);

		LearnToSpeak learnerV1=System.out::println;
		learnerV1.speak(sound);
	}

	public static void main(String[] args) {
		makeSound("Sound");
	}
}
