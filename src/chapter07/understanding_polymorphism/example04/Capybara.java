package chapter07.understanding_polymorphism.example04;

public class Capybara extends Rodent{

	public static void main(String[] args) {
		Rodent rodent =new Rodent();
		var capybara=(Capybara) rodent; //ClassCastException

		if(rodent instanceof Capybara) {

		}
	}
}
