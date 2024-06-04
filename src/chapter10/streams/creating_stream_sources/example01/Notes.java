package chapter10.streams.creating_stream_sources.example01;

public class Notes {

}
//lazy evaluation

//Source: Where the stream comes from

//Intermediate operations: Transforms the stream into another one. There can be as few
//or as many intermediate operations as you’d like. Since streams use lazy evaluation, the
//intermediate operations do not run until the terminal operation runs.

//Terminal operation: Produces a result. Since streams can be used only once, the stream is
//no longer valid after a terminal operation completes.