package chapter09.questions.question14;

public class Question14 {

}

class W {}
class X extends W {}
class Y extends X {}
class Z<Y> {
	W w1 = new W();
	W w2 = new X();
//	W w3 = new Y(); //Does Not Compile
//	Y y1 = new W(); //Does Not Compile
//	Y y2 = new X(); //Does Not Compile
//	Y y1 = new Y(); //Does Not Compile
}