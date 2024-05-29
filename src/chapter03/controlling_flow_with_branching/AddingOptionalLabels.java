package chapter03.controlling_flow_with_branching;

public class AddingOptionalLabels {

	public static void main(String[] args) {

		int frog = 15;
		BAD_IDEA: if (frog > 10) {
			EVEN_WORSE_IDEA: {
				frog++;
			}
		}
	}

}
