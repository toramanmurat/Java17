package chapter01.initializing_veriables.var;

public class TypeInferenceOfVar {

	public void reassigment() {
		var number=7;
		number=4;
//		number="five"; Does Not Compile . var number=7 satirinda number ifadesi int assign edildi. String deger veremeyiz.
	}
	
	public void breakingDeclaration() {
		var silly
		=1;
		
	}
	
}
