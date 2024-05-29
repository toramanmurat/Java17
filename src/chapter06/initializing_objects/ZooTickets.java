package chapter06.initializing_objects;

public class ZooTickets {

	private String name="BestZoo";

	{
		System.out.println(name+" - ");
	}

	private static int COUNT=0;

	static {
		System.out.println(COUNT+" - ");
	}

	static {
		COUNT+=10;
		System.out.println(COUNT+" - ");
	}

	public ZooTickets() {
		System.out.println("z - ");
	}

	public static void main(String[] args) {
		new ZooTickets();
	}

}

// ilk once static bloklar calisacaktir. default degeri 0 oldugu icin 0- yazacaktir.
// 2. static blok calisacaktir ve Count'a 10 eklenerek 10- yazacaktir.
// blok calisacak ve BestZoo - yazacaktir.
// en son obje olusacak ve constructor cagiracak ve z- yazacaktir.
