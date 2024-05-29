package chapter08.coding_functional_interfaces.example04;

//@FunctionalInterface //FunctionalInterface degildir
public interface Hibernate {
	@Override
	String toString();


	public boolean equals(Hibernate o);
//	public boolean equals(Object o); // Object olsaydi object sinifindaki equals metodunu override edecekti ve FunctionalInterface olacakti.

	@Override
	public abstract int hashCode();

	public void rest();
}
