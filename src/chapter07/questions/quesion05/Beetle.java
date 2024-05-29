package chapter07.questions.quesion05;

public class Beetle extends Insect{

//	@Override
//	public int getNumberOfSections(int count) {
//
//		return 1;
//	}

	@Override
	int getNumberOfLegs() {

		return 6;
	}

	@Override
	public int getNumberOfSections() {
		// TODO Auto-generated method stub
		return 0;
	}


}

abstract class Insect implements HasExoskeleton{
	abstract int getNumberOfLegs();
}