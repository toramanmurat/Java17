package chapter01.questions.question10;

public class PrintMagicData {
	public static void main(String[] args) {
		var magic =3_1; //Legal
//		var magic1=1_329_.0; Noktadan once ve sonra "_" kullanamayiz.
//		var magic2=3_13.0_; En sonda "_" kullanamayiz.
//		var magic3=5_291._2;  Noktadan once ve sonra "_" kullanamayiz.
		var magic4=2_234.0_0;  //Legal
		var magic5=9___6;
//		var magic6=_1_3_5_0; 
		
		System.out.println(magic+" "+magic4+" "+magic5);
		
		
	}

}
