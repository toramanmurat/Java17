package chapter06.creating_classes;

public class Flamingo {

	private String color=null;

	public void setColor(String color) {
//		color = color; //null
		this.color=color; //PINK. this anahtar kelimesini kullanmamiz gerekiyor.
	}
	
	public static void main(String...unused) {
		var f=new Flamingo();
		f.setColor("PINK");
		System.out.println(f.color);
		
		
	}
	
}
