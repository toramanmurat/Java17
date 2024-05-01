package chapter08.coding_functional_interfaces.example03;

//@FunctionalInterface  FunctionalInterface degildir. 1 tane abstract metod olmasi gerekiyor.
public interface Sleep {
	private void snore() {}
	default int getZzz() {return 1;}

}
