package chapter01.understanding_data_types;

public class UsingPrimitiveType {

	public static void main(String[] args) {
		boolean activated = true;
		System.out.println(activated);

		byte size = 100;
//		byte height=128; Max Value 127
//		byte height=-129; Min value -128
		System.out.println("byte max value= " + Byte.MAX_VALUE);
		System.out.println("Byte min value= " + Byte.MIN_VALUE);
		System.out.println(size);

		short count = 15000;
//		short total=32768; Max value 32767
//		short minValue=-32770; Min value -32768

		System.out.println("Short max value= " + Short.MAX_VALUE);
		System.out.println("Short min value= " + Short.MIN_VALUE);
		System.out.println(count);

		float sum = 150; // tam sayi kullandigimizda f veya F yazmamiza gerek yok.

//		float square=125.56; Does Not Compiler
		float square = 125.56f;
		float square2 = 1235.4545F;

		System.out.println("Float max value= " + Float.MAX_VALUE);
		System.out.println("Float max value= " + Float.MIN_VALUE);
		System.out.println(sum + " " + square + " " + square2);

//      short signed, char unsigned'tir . Yani char negatif degerlere destek vermez.

		short s1 = 100;
		short s2 = +300;
		short s3 = -500;
		short s4 = 0;

		char c1 = 100;
		char c2 = +400;
		char c3 = 0;
//		char c4=-2; Does not compiler

		System.out.println("Short Max value= "+Short.MAX_VALUE); //32767
		System.out.println("Short Min value= "+Short.MIN_VALUE); // -32768
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);


		System.out.println("Char Max Value= "+(int) Character.MAX_VALUE); // 65535
		System.out.println("Char Min Value= " +(int) Character.MIN_VALUE); // 0
		System.out.println((int)c1 + " " +(int) c2 + " " +(int) c3);

	}

}

// 8 tane primitive tip vardir. boolean,byte,short,int,long,float,double,char
// String primitive tip degildir. Object type.

//byte short int ve long types integer degerler icin kullanilir.
//her bir numeric tip bir oncekine gore 2 kat fazla bit kullanir. byte8 short 16 int 32 long 64
