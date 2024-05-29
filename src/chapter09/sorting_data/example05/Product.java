package chapter09.sorting_data.example05;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	
	public int hashCode() { return id; }
	public boolean equals(Object obj) {
		if(!(obj instanceof Product)) return false;
		var other = (Product) obj;
		return this.id == other.id;
		}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	

}
