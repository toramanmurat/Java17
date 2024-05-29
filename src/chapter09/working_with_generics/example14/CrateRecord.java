package chapter09.working_with_generics.example14;

public record CrateRecord<T>(T contents) {

	@Override
	public T contents() {
		if (contents == null)
			throw new IllegalStateException("missing contents");
		return contents;
	}

}
