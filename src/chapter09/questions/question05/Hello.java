package chapter09.questions.question05;

public record Hello<T>(T t) {
	public Hello(T t) {this.t=t;}
	
	private <T> void println(T message) {
		System.out.println(t+"-"+message);
	}
	
	public static void main(String[] args) {
		new Hello<String>("hi").println(1);
		new Hello("hola").println(true);
	}
//	hi-1
//	hola-true

}
