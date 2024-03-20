package chapter01.declaring_veriables;

import java.util.Date;

public class Identifying_Identifiers {

	public static void main(String[] args) {

		String zooName = "The Best Zoo";
		long okidentifier; //Legar
		float $Ok2Identifier; // $ ile baslayabilir . Legal
		boolean _alsoOKK1d3ntifi3r; // _ ile baslayabilir. Legal
		char __SStillOkButKnotSonice$; // __ ile baslayabilir. Legal
		
		Date date=new Date();
		
//		int 3DPointClass; identifiers cannot begin with a Number. Sayi ile baslayamaz. Legal degil. 
//		byte hollywood@vine; @ kullanamayiz. Legal degil 
//      String *$coffee; * kullanamayiz Legal degil
//		String coffe*; * basta yada sonra olmasi onemli degil.
//		double public; Java da ki anahtar kelimeleri kullanamayiz. Legal degil
//		short _; sadece "_" degisken adi olamaz! Legal degil
		
	}

// identifiers currency sembol veya _ ile baslayabilir. dollar ($), yuan(¥), euro (€),
// Sayi ile baslayamaz.
// Java anahtar kelimeleri kullanilamaz. abstract assert boolean vs.
// herhangi bir uzunluk kisitlamasi yoktur. 

// CamelCase :
//	Metod and variable names 
//		kucuk harf ile baslar 2 kelimeden olusuyorsa 2 kelimenin ilk harfi buyuk olur. Örnek getName() metod, String zooName variable.
//	Class and interface
//		ılk harfi buyuk baslar 2 kelimeden olusuyorsa 2 kelimenin ilk harfi buyuk olur. Örnek ArrayList, LinkedHashMap 
	
	
//	Snake_Case
//	 Genellikle ENUM tanimlarken kullanilir. NUMBER_FLAGS
}
