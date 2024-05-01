package chapter07.implementing_interfaces.example14;

public interface ZooRenovation {
	
	public String projectName();
	
	abstract String status();
	
	default void printStatus() {
		System.out.println("The "+projectName()+" project "+status());
	}
	

}
