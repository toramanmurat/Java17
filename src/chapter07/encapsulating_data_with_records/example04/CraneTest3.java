package chapter07.encapsulating_data_with_records.example04;

public class CraneTest3 {

	public static void main(String[] args) {

		var father=new Crane02(0, "Craig");
		System.out.println(father); //Crane[numberEggs=0, name=Craig]

		var copy=new Crane02(0, "Craig");
		System.out.println(copy); //Crane[numberEggs=0, name=Craig]
		System.out.println(father.equals(copy)); //true
		System.out.println(father.hashCode()+", "+copy.hashCode()); //65368656, 65368656
	}
}
