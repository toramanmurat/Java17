package chapter07.encapsulating_data_with_records.example02;

public class CraneTest01 {

	public static void main(String[] args) {
	     var crane=new Crane01(10, "name");
	     System.out.println(crane);
	     
	     var crane2=new Crane01(-100,"name2"); //java.lang.IllegalArgumentException
	}
}
