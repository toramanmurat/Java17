package chapter05.designin_metods;

public class Hike {

	public void hike1() {
	}

	public void hike2() {
		return;
	}

	public String hike3() {
		return "";
	}
//	public String hike4() {} // Does Not Compile
//	public hike5() {} // Does Not Compile
//	public String int hike6() {} // Does Not Compile

//	String hike7(int a) { //Does Not Compile
//		if(1<2) {
//			return "orange";
//		}
//	}

	String hike8(int a) { // Does Not Compile
		if (1 < 2) {
			return "orange";
		}

		return "apple"; // Dead Code her zaman if blogu calisacagi icin

	}

}
