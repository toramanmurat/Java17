package chapter03.controlling_flow_with_branching;

public class FindInMatrixUsingBreak {

	public static void main(String[] args) {
		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP; // ilk buldugunda kirar ve 1,1 yazar.
//					break; // 2. for'u kirdi ve 2,0 yazdi
//							break ile kirmazsak en son buldugu 2,1 yazar.

				}
			}
		}
		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}
	}

}
