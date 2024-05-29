package chapter03.questions.question09;

public class Quesiton09 {

	public static void main(String[] args) {

		printA();
		printB();
		printC();
		printD();
	}

	static void printA() {
		int count = 0;
		BUNNY: for (int row = 1; row <= 3; row++) {
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0) {
					break BUNNY;
				}
				count++;
			}
		}
		System.out.println(count);
	}

	static void printB() {
		int count = 0;
		BUNNY: for (int row = 1; row <= 3; row++) {
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0) {
					break RABBIT;
				}
				count++;
			}
		}
		System.out.println(count); //2
	}

	static void printC() {
		int count = 0;
		BUNNY: for (int row = 1; row <= 3; row++) {
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0) {
					continue BUNNY;
				}
				count++;
			}
		}
		System.out.println(count); //2
	}

	static void printD() {
		int count = 0;
		BUNNY: for (int row = 1; row <= 3; row++) {
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0) {
					continue RABBIT;
				}
				count++;
			}
		}
		System.out.println(count); //2
	}







}
