package chapter07.sealing_classes.example08;

//public sealed class Snake3 permits Cobra3{} //Does Not Compile

public sealed class Snake3 permits Snake3.Cobra3{
	final class Cobra3 extends Snake3{}
}
