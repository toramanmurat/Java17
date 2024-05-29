package chapter08.writing_simple_lambdas.example02;

public class ValidLambdasExpression {

	V03 v1 = () -> true;
	V02 v2 = x -> x.startsWith("test");
	V02 v3=(String x)-> x.startsWith("test");
	V01 v4= (x,y)->{return x.startsWith("test");}; // ; dikkat
	V01 v5=(String x,String y)->x.startsWith("test");


}

interface V01 {
	boolean sample(String str1, String str2);
}

interface V02 {
	boolean sample(String str1);
}

interface V03 {
	boolean sample();
}