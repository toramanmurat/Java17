package chapter09.working_with_generics.example04;

public class SizeLimitedCrate<T,U> {
	private T contents;
	private U sizeLimit;
	public SizeLimitedCrate(T contents, U sizeLimit) {
		super();
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}
	public T getContents() {
		return contents;
	}
	public void setContents(T contents) {
		this.contents = contents;
	}
	public U getSizeLimit() {
		return sizeLimit;
	}
	public void setSizeLimit(U sizeLimit) {
		this.sizeLimit = sizeLimit;
	}
	
	
	
	

}
