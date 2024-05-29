package chapter07.implementing_interfaces.example09;

public interface IsColdBlooded {

	boolean hasScales();
	default double getTemperature() {
		return 10.0;
	}

}

//default metodları override etmek zorunda degiliz.