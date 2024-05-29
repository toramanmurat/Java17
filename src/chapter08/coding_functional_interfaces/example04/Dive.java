package chapter08.coding_functional_interfaces.example04;

@FunctionalInterface //1 tane dive abstract metod
public interface Dive {
	@Override
	String toString();

	@Override
	public boolean equals(Object o);

	@Override
	public abstract int hashCode();

	public void dive();
}
