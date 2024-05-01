package chapter08.questions.question04;

public class MySecret implements Secret {

	@Override
	public String magic(double d) {
		// TODO Auto-generated method stub
		return "Poof";
//		return (e)->"Poof";
//		return (e) ->{"Poof"};
//		return (e) ->{ String e = ""; "Poof" };
//		return (e) ->{ String e = ""; return "Poof"; };
//		return (e) ->{ String e = ""; return "Poof" };
//		return (e) ->{ String f = ""; return "Poof"; };
		
		
	}
	
	public static void main(String[] args) {
		Secret lambdaSecret1= (e)->"Poof";
//		Secret lambdaSecret2=(e) ->{"Poof"};
		Secret lambdaSecret2=(e) ->{ return "Poof";};
//		Secret lambdaSecret3=(e) ->{ String e = ""; "Poof" }; // Parametre ismiyle ayni isimde bir degisken tanimlanamaz.
//		Secret lambdaSecret4=(e) ->{ String e = ""; return "Poof" }; // Parametre ismiyle ayni isimde bir degisken tanimlanamaz.
//		Secret lambdaSecret5=(e) ->{ String e = ""; return "Poof" };// Parametre ismiyle ayni isimde bir degisken tanimlanamaz.
		Secret lambdaSecret6=(e) ->{ String f = ""; return "Poof"; };
		
	}

}
