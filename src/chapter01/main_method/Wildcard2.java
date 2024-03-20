package chapter01.main_method;

//import java.util.*; // AtomicInteger child package. Not compiler
//import java.util.concurrent.*; import java.util.concurrent.*; Not compiler
//import java.util.concurrent.atomic.*;  Compiler
import java.util.concurrent.atomic.AtomicInteger;

// atomicInteger class'i util->concurrent->atomic package altinda. import java.util.concurrent.atomic.* olarakta import edebiliriz.

public class Wildcard2 {

	public static void main(String[] args) {
		AtomicInteger a = new AtomicInteger(1234);
		System.out.println(a);

	}
}
