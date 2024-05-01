package chapter08.coding_functional_interfaces.example04;

@FunctionalInterface //1 tane dive abstract metod
public interface Dive {
	String toString();

	public boolean equals(Object o);

	public abstract int hashCode();

	public void dive();
}
