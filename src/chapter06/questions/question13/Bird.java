package chapter06.questions.question13;

public class Bird {
	
//	public bird() {} //Does Not Compile. Bird ok  
	
//	public bird(String name) {} //Does Not Compile. Bird ok  
	
	public Bird() {} //Ok
	
	Bird(String name) {} //ok
	
	private Bird(int age) {} //0k
	
	public Bird bird() { return null; } // Compile. Constructor degil. 
	
	

}

