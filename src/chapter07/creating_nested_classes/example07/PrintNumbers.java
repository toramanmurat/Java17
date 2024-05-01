package chapter07.creating_nested_classes.example07;

public class PrintNumbers {

	private int length = 5;

	public void calculate() {
		final int width = 20;

		class Calculator {
			public void multiply() {
				System.out.println(length * width);
			}
		}

		var calculator = new Calculator();
		calculator.multiply();
	}



	public void processData() {
		final int length = 5;
		int width = 10;
		int height = 3;
		class VolumeCalculator {
			public int multiply() {
				
			return length * width * height; // DOES NOT COMPILE width degeri 2 kere atandigi icin 
			}
		}
		
//		width = 2; multiply metodu icerisinde derleme hatasina sebeb olacaktir.
		
		var volume=new VolumeCalculator();
		System.out.println(volume.multiply()); //150
	}
	
	public static void main(String[] args) {
		var printer = new PrintNumbers();
		printer.calculate(); // 100
		
		printer.processData();
		
		
		
		
		
	}

}
