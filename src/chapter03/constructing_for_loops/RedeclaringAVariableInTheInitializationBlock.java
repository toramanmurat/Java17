package chapter03.constructing_for_loops;

public class RedeclaringAVariableInTheInitializationBlock {
	
	public static void main(String[] args) {
		        int x = 0;
//				for (int x = 4; x < 5; x++) // DOES NOT COMPILE. int'i kaldirdigimizda hata giderilecektir.
//					System.out.print(x + " ");
		        
		        for (x = 0; x < 5; x++)
		            System.out.print(x + " ");
		    
	}

}
