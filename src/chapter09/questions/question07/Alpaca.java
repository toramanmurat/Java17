package chapter09.questions.question07;

import java.util.ArrayList;
import java.util.List;

public class Alpaca {
	public List<String> hairy(List<String> list) {
		return null;
	}

}

class A extends Alpaca {
//	public List<String> hairy(List<CharSequence> list) {
//	return null;
//}
}

class B extends Alpaca {

	@Override
	public List<String> hairy(List<String> list) {
		return null;
	}

	public List<String> hairy(ArrayList<String> list) {
		return null;
	}

}

class C extends Alpaca {
//	public List<String> hairy(List<Integer> list) {
//	return null;
//}
}

class D extends Alpaca {
//	public List<CharSequence> hairy(List<String> list) { return null; }
}

class E extends Alpaca {
//	public Object hairy(List<String> list) { return null; }
}

class F extends Alpaca {
	@Override
	public ArrayList<String> hairy(List<String> list) { return null; }
}