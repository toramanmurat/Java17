package chapter07.working_with_enums.example06;

public enum SeasonV3 {
	WINTER{
		@Override
		public String getHours() {return "10am-3pm";}
	},

	SPRING{
		@Override
		public String getHours() {return "9am-5pm";}
	},

	SUMMUR{
		@Override
		public String getHours() {return "9am-7pm";}
	},
	FALL{
		@Override
		public String getHours() {return "9am-5pm";}
	};

	public abstract String getHours();

	//abstract metodların her bir enumda override edilmesi gerekir.


}
