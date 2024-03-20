package chapter03.wrting_while_loops;

public class WhileStatement {

	public static void main(String[] args) {
		int counter = 0;
		while (counter < 10) {
			double price = counter * 10;
			System.out.println(price);
			counter++;
		}

//	        while(int x = 0 ; x<5){ //Does Not Compile
//	            System.out.println(x);
//	        }
	}

}
