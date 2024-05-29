package chapter07.questions.question19;

public class Bear {

	enum FOOD {
		BERRIES {
			@Override
			public boolean isHealthy() {
				// TODO Auto-generated method stub
				return false;
			}
		}, INSECTS {
			@Override
			public boolean isHealthy() {
				return true;
			}
		},
		FISH {
			@Override
			public boolean isHealthy() {
				// TODO Auto-generated method stub
				return false;
			}
		}, ROOTS {
			@Override
			public boolean isHealthy() {
				// TODO Auto-generated method stub
				return false;
			}
		}, COOKIES {
			@Override
			public boolean isHealthy() {
				// TODO Auto-generated method stub
				return false;
			}
		}, HONEY {
			@Override
			public boolean isHealthy() {
				// TODO Auto-generated method stub
				return false;
			}
		};

		public abstract boolean isHealthy(); //absract metodu butun enumlar icin override etmemiz gerekir.
	}

	public static void main(String[] args) {
		System.out.print(FOOD.INSECTS);
		System.out.print(FOOD.INSECTS.ordinal());
		System.out.print(FOOD.INSECTS.isHealthy());
		System.out.print(FOOD.COOKIES.isHealthy());
	}
}
