package chapter02.questions.question21;

public class Question21 {

	public static void main(String[] args) {
		int myFavoriteNumber = 8;
		int bird = ~myFavoriteNumber;
		int plane = -myFavoriteNumber;
		var superman = bird == plane ? 5 : 10;
		System.out.println(bird + "," + plane + "," + --superman);

	}

}
