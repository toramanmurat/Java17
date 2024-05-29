package chapter05.passing_Data_among_methods;

public class DogV2 {
	public static void main(String[] args) {
		var name=new StringBuilder("Webby");
		speak(name);
		System.out.println(name); //WebbyGeorgette
	}

	public static void speak(StringBuilder s) {
		s.append("Georgette");
	}

}
