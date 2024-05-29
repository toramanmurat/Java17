package chapter04.creating_and_manipulating_strings;

public class FindingAnIndex {

	public static void main(String[] args) {
		var name="animals";

		System.out.println("IndexOf Metod");
		System.out.println(name.indexOf('a')); //0
		System.out.println(name.indexOf("al")); //4
		System.out.println(name.indexOf('a',4)); //4
		System.out.println(name.indexOf("al",5) ); //-1
		System.out.println(name.indexOf("ls",4)); //5
		System.out.println(name.indexOf("m",3)); // index numarasina gore 3. karakterden sonra m var mi?

		System.out.println("#LastIndexOf Metod");
		var name2="animalstwso";
		System.out.println(name2.lastIndexOf("w")); //8
		System.out.println(name2.lastIndexOf("s")); //9 sondan basladi ilk s 'nin indexini verdi
		System.out.println(name2.indexOf("s")); //6 bastan basladi ilk s'nin indexini dondu
		System.out.println(name2.lastIndexOf("t",9)); //7 icerde ki parametre bastan baslayarak indexler. Yani 9 indexten sonra geriye dogru giderek t degiskenini buldugunda index numarasini doner
		System.out.println(name2.lastIndexOf("t",3)); //-1 3. indexten sonra geriye dogru bakar
		System.out.println(name2.lastIndexOf("t",7)); //7

	}

}


// indexOf overloaded metodlari
// public int indexOf(int ch)
// public int indexOf(int ch, int fromIndex)
// public int indexOf(String str)
// public int indexOf(String str, int fromIndex)