package chapter07.implementing_interfaces.example12;

public class Bunny implements Hop{

	public void printDetails() {
		System.out.println(Hop.getJumpHeight());
//		System.out.println(getJumpHeight());// Does Not Compile

	}

	public static void main(String[] args) {
		Bunny b=new Bunny();
		b.printDetails();
	}
}


// interface'lerde ki static metodlar inherit edilmezler.