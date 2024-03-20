package chapter03.questions.Question21;

public class Question21 {

	public static void main(String[] args) {
		
		findZookeeper(30);
	}
	
	static void findZookeeper(int id) { 
		System.out.println(switch(id) { //switch ifadelerde Long kullanamayiz.
		case 10 ->"Jane"; // {yield "Jane";}
		case 20 -> {yield "Lisa";} // sonuna ; koyarsak hata verecektir.
		case 30 ->"Kelly";
		case 40 ->"Sarah"; // case'lerde ayni case degerini kullanamayiz.
		default ->"Unassigned";
		});
	}
	
}
