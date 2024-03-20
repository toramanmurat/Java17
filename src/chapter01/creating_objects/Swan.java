package chapter01.creating_objects;

public class Swan {

	int numberEggs; //instance veriable
	
	public static void main(String[] args) {
		Swan mother=new Swan();
		mother.numberEggs=1; //set veriable
		System.out.println(mother.numberEggs); //read veriable
	}
}
