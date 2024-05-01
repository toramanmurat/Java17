package chapter07.creating_nested_classes.example09;

public class ZooGiftShop2 {
	
	interface SaleTodayOnly{
		int dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale=new SaleTodayOnly() {
			
			@Override
			public int dollarsOff() {
				// TODO Auto-generated method stub
				return 3;
			}
		};
		
		return basePrice-sale.dollarsOff();
	}

}
