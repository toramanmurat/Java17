package chapter10.streams.creating_stream_sources.example03;

import java.util.stream.Stream;

public class PrintingStreamReference {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("value");
		System.err.println(stream); //java.util.stream.ReferencePipeline$Head@4a574795

	}
}
