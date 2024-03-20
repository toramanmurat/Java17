package chapter03.questions.question05;

import java.util.ArrayList;
import java.util.List;

public class Question05 {

	public static void main(String[] args) {
		FavoriteNumbers();
	}

	static void FavoriteNumbers() {
		List<Integer> myFavoriteNumbers = new ArrayList<Integer>();
		myFavoriteNumbers.add(10);
		myFavoriteNumbers.add(14);
		for (var a : myFavoriteNumbers) {
			System.out.print(a + ", ");
			break;
		}

//		for (int b : myFavoriteNumbers) {
//			continue;
//			System.out.print(b + ", ");
//		}
//		
		for (Object c : myFavoriteNumbers)
			System.out.print(c + ", ");

	}
}
