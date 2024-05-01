package chapter07.encapsulating_data_with_records.example11;

public class CraneTest11 {

	public static void main(String[] args) {
		Crane11 crane=new Crane11(10, "good-crane"); //10 gondermemize ragmen contructor da numberEggs 5 atadigimiz icin degeri 5 oldu
		System.out.println(crane); //Crane11[numberEggs=5, name=Good-crane]
	}
}
