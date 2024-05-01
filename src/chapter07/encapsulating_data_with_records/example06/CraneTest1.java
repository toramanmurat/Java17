package chapter07.encapsulating_data_with_records.example06;

public class CraneTest1 {

	public static void main(String[] args) {
		var cousin=new Crane(3, "Jenny");
		var friend=new Crane(cousin.numberEggs(),"Janeice");
		
		
	}
}


//records finaldir.