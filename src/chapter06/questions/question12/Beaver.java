package chapter06.questions.question12;

public class Beaver extends Rodent {



	public Beaver(Integer x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer chew() throws RuntimeException { //Number yerine Integer yap!
		System.out.println("Beaver is chewing on wood");
		return 2;
	}


}

//2 tane error!

// Beaver class constructor ekle!

