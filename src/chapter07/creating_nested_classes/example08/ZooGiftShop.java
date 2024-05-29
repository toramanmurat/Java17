package chapter07.creating_nested_classes.example08;

public class ZooGiftShop {
	abstract class SaleTodayOnly{
		abstract int dollatsOff();
	}

	public int admission(int basePrice) {
		SaleTodayOnly sale=new SaleTodayOnly() {

			@Override
			int dollatsOff() {
				// TODO Auto-generated method stub
				return 3;
			}
		};

		return basePrice-sale.dollatsOff();
	}

}
