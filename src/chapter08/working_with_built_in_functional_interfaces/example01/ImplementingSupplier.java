package chapter08.working_with_built_in_functional_interfaces.example01;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ImplementingSupplier {

	public static void main(String[] args) {
		Supplier<LocalDate> s1=LocalDate::now;
		Supplier<LocalDate> s2=()->LocalDate.now();

		LocalDate d1=s1.get();
		LocalDate d2=s2.get();

		System.out.println(d1);
		System.out.println(d2);
	}
}
