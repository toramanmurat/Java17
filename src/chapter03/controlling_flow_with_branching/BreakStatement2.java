package chapter03.controlling_flow_with_branching;

public class BreakStatement2 {

	public static void main(String[] args) {
		
		Loop:
		for(int i=0;i<100;i++) {
			System.out.println(i);
			if(i==10)
				break Loop; // donguyu buraada kiracak
		}
	}
}
