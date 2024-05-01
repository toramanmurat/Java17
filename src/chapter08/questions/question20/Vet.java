package chapter08.questions.question20;

public class Vet {
	public static String takeNap(Yawn y) {
		return y.yawn(10, null);
	}

	public static void main(String... unused) {
		System.out.print(takeNap(new Sloth()));

//		System.out.println(takeNap((z,f) ->{ String x = ""; return "Sleep: " + x }));  //Does Not Compile
//		System.out.println(takeNap((t, s) -> {String t = "";return "Sleep: " + t;})); //Does Not Compile
//		System.out.println(takeNap((w,q) ->{"Sleep: " + w})); // Does Not Compile
//		System.out.println(takeNap((e,u) ->{ String g = ""; "Sleep: " + e })); // Does Not Compile
		System.out.println(takeNap((a,b) ->"Sleep: " + (double)(b==null ? a : a))); 
		System.out.println(takeNap((r,k) ->{ String g = ""; return "Sleep:"; }));
	}

}
