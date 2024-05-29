package chapter08.writing_simple_lambdas.example02;

public class InValidLambdasExpression {

//	V01 v1=x, y ->x.startsWith("fish");
	V001 v1 = (x, y) -> x.startsWith("fish");

//	V02 v2=x ->{ x.startsWith("camel"); } ; // return Dikkat!
	V002 v2=x ->{return x.startsWith("camel"); };

//	V02 v3=x ->{ return x.startsWith("giraffe") };
	V002 v3=x ->{ return x.startsWith("giraffe");}; //; dikkat!

//	V02 v4=String x ->x.endsWith("eagle"); () Dikkat!
	V002 v4=(String x) ->x.endsWith("eagle");




}

interface V001 {
	boolean sample(String str1, String str2);
}

interface V002 {
	boolean sample(String str1);
}
