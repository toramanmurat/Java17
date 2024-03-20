package chapter03.questions.question20;

public class Question20 {

	public static void main(String[] args) {
		methodA();
//		methodB();
//		methodD();
		methodE();
		
	}

	private static void methodA() {
		int height = 1;
		L1: while (height++ < 10) {
			long humidity = 12;
			L2: do {
				if (humidity-- % 12 == 0)
					break L2;
				int temperature = 30;
				L3: for (;;) {
					temperature++;
					if (temperature > 50)
						continue L2;
				}
			} while (humidity > 4);
		}
		System.out.println("MethodA");
	}

	private static void methodB() {
		int height = 1;
		L1: while (height++ < 10) {
			long humidity = 12;
			L2: do {
				if (humidity-- % 12 == 0)
					continue;
				int temperature = 30;
				L3: for (;;) {
					temperature++;
					if (temperature > 50)
						continue;
				}
			} while (humidity > 4);
		}
		System.out.println("MethodB");
	}

//	private static void methodC() {
//		int height = 1;
//		L1: while (height++ < 10) {
//			long humidity = 12;
//			L2: do {
//				if (humidity-- % 12 == 0)
//					break L3;
//				int temperature = 30;
//				L3: for (;;) {
//					temperature++;
//					if (temperature > 50)
//						break L1;
//				}
//			} while (humidity > 4);
//		}
//	}

	private static void methodD() {
		int height = 1;
		L1: while (height++ < 10) {
			long humidity = 12;
			L2: do {
				if (humidity-- % 12 == 0)
					continue L2;
				int temperature = 30;
				L3: for (;;) {
					temperature++;
					if (temperature > 50)
						continue L3;
				}
			} while (humidity > 4);
		}
		System.out.println("MethodD");
	}

	private static void methodE() {
		int height = 1;
		L1: while (height++ < 10) {
			long humidity = 12;
			L2: do {
				if (humidity-- % 12 == 0)
					continue L2;
				int temperature = 30;
				L3: for (;;) {
					temperature++;
					if (temperature > 50)
						continue L2;
				}
			} while (humidity > 4);
		}
		System.out.println("MethodE");
	}

}
