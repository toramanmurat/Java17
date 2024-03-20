package chapter01.understanding_data_types;

public class DistinguishingPrimitiAndReference {
	
	public static void main(String[] args) {
		
		String reference="hello";
		int len=reference.length();
//		int bad=len.length(); Does Not Compile
		
//		int value=null primitive tiplere null degeri atanamaz.
		String name=null;
		
		System.out.println(len+" "+name);
	}

}
