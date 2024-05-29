package chapter05.designin_metods;

public class ReturnType {

	public static void swim(int distance) {
		if(distance<=0) {
			return;
		}
		System.out.println("Fish is swimmig "+distance+" meters");
	}

	public static void main(String[] args) {
		swim(5);
		swim(-1);
	}
}
