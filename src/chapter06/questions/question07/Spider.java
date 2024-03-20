package chapter06.questions.question07;

public class Spider extends Arthropod{

	protected void printName(int input) {
		System.out.print("Spider");
	}
	
	public static void main(String[] args) {
		Arthropod a = new Spider();
		a.printName((short)4); //sniper
		a.printName(4); //sniper
		a.printName(5L); //Arthropod
	}
}


//SpiderSpiderArthropod