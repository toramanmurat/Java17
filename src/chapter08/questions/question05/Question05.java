package chapter08.questions.question05;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class Question05 {
//	A. BooleanSupplier Ok
//	B. CharSupplier
//	C. DoubleSupplier Ok
//	D. FloatSupplier
//	E. IntSupplier Ok
//	F. StringSupplier

	public static void main(String[] args) {
		BooleanSupplier bs1=()->true;
		IntSupplier is1= ()->10;
		LongSupplier ls1=()->10L;
		DoubleSupplier ds1= ()->10.0;

	}
}
