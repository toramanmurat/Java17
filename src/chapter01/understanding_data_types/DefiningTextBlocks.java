package chapter01.understanding_data_types;

public class DefiningTextBlocks {

	public static void main(String[] args) {
		String pyramid="""
				*
				**
				***
				""";
		
//		String block="""doe"""; Does Not Compiler
		
		String block="""
				doe \
				deer
				""";
		
		String block2="""
				doe \
				deer \
				murat
				""";
//		\ kacis karakteri yeni bir satir eklenmemesi icin
		
		
		System.out.println(pyramid);
		
		System.out.println(block); // doe deer
		
		System.out.println(block2); // doe deer murat
		
		String block3="""
				doo \n
				deer
				""";
		
		String block4="""
				doe \n
				deer \n
				murat
				""";
//		\n karakteri alt satira gecmek icin
		
		
		System.out.println(block3); 
//		doo
//		deer
		System.out.println(block4);
//		doe
//		deer
//		murat
		
		
		String block5="""
				"doe\"\"\"
				\"deer\"""
				""";
		
		System.out.println("*"+block5+"*");
//		*"doe"""
//		"deer"""
//		*
		
		String pyramid2="""
				*
				**
				***
			""";
		
	
		System.out.println(pyramid2);
		
		String pyramid3="""
				*
				**
				***
				
		""";
		System.out.println(pyramid3);
		
//		kapatilan """ yerine gore sag tarafa kayar
		
		String pyramid4="""
			   *
			  * *
			 * * *
			   """;
		
		System.out.println(pyramid4);
		
		
	}
}
