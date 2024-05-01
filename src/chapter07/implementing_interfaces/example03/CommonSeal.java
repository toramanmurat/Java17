package chapter07.implementing_interfaces.example03;

//public class CommonSeal extends HarborSeal{} //Does Not Compile


//Metodlari implement etmemiz zorunludur.
public class CommonSeal extends HarborSeal {

	@Override
	public int getTailLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfWhiskers() {
		return 0;
	}
}