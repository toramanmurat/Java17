package chapter07.implementing_interfaces.example14;

public class ZooRenovationImple implements ZooRenovation{

	@Override
	public String projectName() {
		// TODO Auto-generated method stub
		return "ZooProject";
	}

	@Override
	public String status() {
		// TODO Auto-generated method stub
		return "Open";
	}

	public static void main(String[] args) {
		ZooRenovation z=new ZooRenovationImple();
		z.printStatus();
	}
}
