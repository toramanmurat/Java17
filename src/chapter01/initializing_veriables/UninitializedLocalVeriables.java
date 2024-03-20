package chapter01.initializing_veriables;

public class UninitializedLocalVeriables {

	public void notValid() {
		int y = 10;
		int x;
//		int reply=x+y; Does Not Compile
//		x e deger atamasi yapmadigimiz icin codu'muz hata verecektir.

	}
	
	public int valid() {
		int y=10;
		int x; // x degiskeni tanimladik
		x=3; // x degerine deger atadik.
		int z; // z degiskeni tanimladik. ancak z degiskenini hicbir yerde kullanmadik. Code hata vermez.
		
		int reply=x+y;
		return reply;
	}
	
	public void findAnswer(boolean check) {
		
		int answer;
		int otherAnswer;
		int onlyOneBranch;
		
		if(check) {
			onlyOneBranch=1;
			answer=1;
		}
		else {
			answer=2;
			
		}
		System.out.println(answer);
//		System.out.println(onlyOneBranch); Does Not Compiler 
//		answer check sartını saglarsa degeri 1 saglamazsa 2 degerini alacagi icin code hata vermez.
//		onlyOneBranch check sarti saglanirsa deger atamasi olacak ancak else bloguna girerse deger atamasi olmayacagından dolayı code hata verir!
		
	}
	
	public int notValid2() {
		int x;
		int y;
		
//		System.out.println(x); Does Not Compile
//		System.out.println(y); Does Not Compile
		
		return 0;
	}
	public int valid2() {
		int x;
		int y;
		return 0;
	}
}
