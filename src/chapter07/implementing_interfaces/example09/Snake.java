package chapter07.implementing_interfaces.example09;

public class Snake implements IsColdBlooded{

	@Override
	public boolean hasScales() {  //Required override
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double getTemperature() { //Optional override
		return 12;
	}

	public static void main(String[] args) {
		Snake s=new Snake();
		System.out.println(s.hasScales());
		System.out.println(s.getTemperature());
	}
}


//bir default metod abstract, final, static olamaz.