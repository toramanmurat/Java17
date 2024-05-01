package chapter08.working_with_built_in_functional_interfaces.example08;

import java.util.function.BooleanSupplier;

public class PrimitiveTypesSupplierInterfaceForBoolean {

	public static void main(String[] args) {
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > .5;
		System.out.println(b1.getAsBoolean()); // true
		System.out.println(b2.getAsBoolean()); // false || true
	}
}
