package chapter07.implementing_interfaces.example01;

public class FiealMouse implements Climb,CanBurrow{

	@Override
	public Float getSpeed(int age) {
		// TODO Auto-generated method stub
		return null;
	}

}

// Java'da bir class bir class'i 1 kez extends edebilir.
// Java'da bir class birden fazla class'i implement edilir.!
// interface'lerde constructor yoktur !!
// interface'lerin metodlari public tir.
// bir class implement ettigi interfaced metodlarini override etmelidir.
// Bir interface bir interface' extends edebilir.