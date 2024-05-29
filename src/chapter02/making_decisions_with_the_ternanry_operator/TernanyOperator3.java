package chapter02.making_decisions_with_the_ternanry_operator;

public class TernanyOperator3 {

	public static void main(String[] args) {

		int stripes=7;
		System.out.println((stripes>5)?21 :"Zebra");

		Object obj=stripes>5?21:"Zebra";
		System.out.println(obj);

//		String str=stripes>8 ?21:"Zebra"; // Does Not Compile
//		System.out.println(str);
	}

}
