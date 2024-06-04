package chapter10.working_with_primitive_streams.creating_primitive_streams.example02;

import java.util.stream.DoubleStream;

public class PrimitiveStreamExample {

	public static void main(String[] args) {
		DoubleStream empty=DoubleStream.empty();
		System.out.println(empty);
		
		DoubleStream oneValue=DoubleStream.of(3.14);
		oneValue.forEach(System.out::println);
		
		DoubleStream varargs=DoubleStream.of(1.0,1.1,1.2);
		varargs.forEach(System.out::println);
	}

}
