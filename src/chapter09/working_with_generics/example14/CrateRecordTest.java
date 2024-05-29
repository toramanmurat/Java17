package chapter09.working_with_generics.example14;

import chapter09.working_with_generics.example08.Robot;

public class CrateRecordTest {

	public static void main(String[] args) {
		Robot robot=new Robot();
		CrateRecord<Robot> record=new CrateRecord<Robot>(robot);
	}
}
