package chapter01.managing_variable_scope;

public class ApplyingScopeClasses {

	final static int MAX_LENGT=5;
	int length;

	public void grow(int inches) {
		if (length<MAX_LENGT) {
			int newSize= length+inches;
			length=newSize;
		}
	}



}
