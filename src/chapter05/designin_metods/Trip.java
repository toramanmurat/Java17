package chapter05.designin_metods;

public class Trip {
	
	public void visitZoo(String name, int waitTime) {}
//	public void visitZoo(String attraction, int rainFall) {} // Does Not Compile. metod tipleri ve yerleri ayni
	public void visitZoo(int attraction, String rainFall) {} //olabilir. overloaded metod!
	public void visitZoo(int attraction, int rainFall) {}
	

}
