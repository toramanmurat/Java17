package chapter08.writing_simple_lambdas.example01;

public class CheckIfHopper implements CheckTrait {

	@Override
	public boolean test(Animal a) {
		return a.canHop();
	}

}
