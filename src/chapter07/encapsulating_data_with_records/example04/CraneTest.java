package chapter07.encapsulating_data_with_records.example04;

public class CraneTest {
	
	public static void main(String[] args) {
		 var mommy=new Crane02(4,"Cammy");
		 System.out.println(mommy.numberEggs());
		 System.out.println(mommy.name());
		 
		 System.out.println(mommy); //Crane[numberEggs=4, name=Cammy]

	}

}


//record tanımladigimizca toString,hashCode,equals gibi metodlarda arka planda tanimlanir.