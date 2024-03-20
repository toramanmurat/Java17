package chapter04.creating_and_manipulating_strings;

public class FormatingValuesWithFlags {

	public static void main(String[] args) {
		var pi = 3.14159265359;
		System.out.format("[%f]", pi); // [3.141593] varsayilan olarak . sonra 6 karakter
		System.out.format("[%12.8f]", pi); // [  3.14159265] . noktadan sonra 8 karakter toplam 12. o yüzden basına bosluk koyar
		System.out.format("[%012f]", pi); // [00003.141593]. noktadan sonra 6 karakter.
		System.out.format("[%12.2f]", pi); // [ 3.14]
		System.out.format("[%.3f]", pi); // [3.142]
	}
}
