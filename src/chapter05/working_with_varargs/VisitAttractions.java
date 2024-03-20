package chapter05.working_with_varargs;

public class VisitAttractions {
	
	public static void main(String[] args) {
		int[] data=new int[]{1,2,3};
		walk1(data);
		
		walk1(1,2,3);
		walk1();
		
//		walk1(null); //java.lang.NullPointerException
		
		
		
	}
	public static void walk1(int... steps) {
		int[] step2=steps;
		System.out.println(step2.length);
	}

	public void walk2(int start, int... steps) {
	}

//	public void walk3(int... steps, int start) {  //varargs en sonra olmalidir
//	} // DOES NOT COMPILE

//	public void walk4(int... start, int... steps) { //en fazla bir tane varargs tanimlanabilir.
//	} // DOES NOT COMPILE

}

// Notes **
// 1- Bir metod en fazla bir tane varargs parametresi alabilir.
// 2- Eger bir metodta varargs var ise bu en sonda ki parametre olmalidir.