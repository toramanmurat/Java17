package chapter03.questions.Question24;

public class Question24 {

	public static void main(String[] args) {
		String[] friends= {"Ali","Ayse"};

//		for(var friend in friends) { Does Not Compile
//			System.out.println(friend);
//		}

		for(var friend : friends) {
			System.out.println(friend);
		}
	}

}
