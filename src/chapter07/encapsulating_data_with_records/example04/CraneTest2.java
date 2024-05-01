package chapter07.encapsulating_data_with_records.example04;

public class CraneTest2 {

	public static void main(String[] args) {

//		var mommy1 = new Crane02("Cammy", 4); // DOES NOT COMPILE
//		var mommy2 = new Crane02("Cammy"); // DOES NOT COMPILE
		// Contructor tanimladimiz siraya goredir.
		//Crane02(int numberEggs,String name)
		var mommy3 = new Crane02(4, "Cammy");
		System.out.println(mommy3);
	}
}
