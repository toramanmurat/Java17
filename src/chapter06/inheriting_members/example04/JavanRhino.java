package chapter06.inheriting_members.example04;

public class JavanRhino extends Rhino {
	@Override
	public String getName() {
		return "javan rhino";
	}

//	public CharSequence getColor() { // DOES NOT COMPILE
//		return "grey";
//	}

}
