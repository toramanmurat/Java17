package chapter05.accessing_static_data;

public class Penguin {
	String name;
	static String nameOfTallestPenguin;

	public static void main(String[] args) {
		var p1 = new Penguin();
		p1.name = "Lilly";
		Penguin.nameOfTallestPenguin = "Lilly";
		var p2 = new Penguin();
		p2.name = "Willy";
		Penguin.nameOfTallestPenguin = "Willy";
		System.out.println(p1.name); // Lilly
		System.out.println(Penguin.nameOfTallestPenguin); // Willy
		System.out.println(p2.name); // Willy
		System.out.println(Penguin.nameOfTallestPenguin); // Willy
	}

}

// static metodlari direk olarak, bir obje olusturmadan cagirabiliriz.Static degiskenler sinifa aittir.
// instance metodlar ve instance veriable obje'ye aittir. Bu yuzden cagrirken obje olusturmak zorunludur.