package chapter07.working_with_enums.example07;

public enum SeasonV4 implements Weather{
	WINTER, SPRING, SUMMER, FALL;

	@Override
	public int getAverageTemperature() {
		// TODO Auto-generated method stub
		return 30;
	}
}
