package chapter02.questions.question08;

public class Question08 {

	public static void main(String[] args) {
		int pig = (short)4;
		pig= pig++; // pig=4 , 4 u basta pig degiskenine orjinal degeri atar sonradan degerini artirir.
		long goat=2;
		goat -=1.0;
		System.out.println(pig+"-"+goat);

		int pig2=4;
		pig2=(++pig2);// pig=4, 4 u basta arttirir sonra pig2 degiskenine atar.
		System.out.println(pig2);

	}

}
