package chapter03.controlling_flow_with_branching;

public class ContinueStatement4 {

	public static void main(String[] args) {

		OUTER: for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					continue OUTER;
				}
				System.out.println(i + "," + j);
			}

			System.out.println("line1");
			System.out.println("line2");
			System.out.println();
		}
	}

//	0,0
//	0,1
//	0,2
//	0,3
//	0,4
//	line1
//	line2
//
//	1,0
//	1,1
//	1,2
//	1,3
//	1,4
//	line1
//	line2
//
//	3,0
//	3,1
//	3,2
//	3,3
//	3,4
//	line1
//	line2
//
//	4,0
//	4,1
//	4,2
//	4,3
//	4,4
//	line1
//	line2
}
