package chapter06.creating_abstract_classes.example01;

public class Jackal extends Canine {
//	public abstract String name; // Does Not Compile

	@Override
	public String getSound() {
		return "Laugh";
	}

}
