package chapter09.questions.question12;


import java.util.Comparator;
import java.util.TreeSet;

public record Sorted(int num, String text) implements Comparable<Sorted>, Comparator<Sorted> {

	public String toString() {
		return "" + num;
	}

	@Override
	public int compare(Sorted o1, Sorted o2) {
		// TODO Auto-generated method stub
		return o1.num - o2.num;
	}

	@Override
	public int compareTo(Sorted o) {
		// TODO Auto-generated method stub
		return text.compareTo(o.text);
	}

	public static void main(String[] args) {
		var s1 = new Sorted(88, "a");
		var s2 = new Sorted(55, "b");
		var t1 = new TreeSet<Sorted>();
		t1.add(s1);
		t1.add(s2);
		var t2 = new TreeSet<Sorted>(s1);
		t2.add(s1);
		t2.add(s2);
		System.out.println(t1 + " " + t2); //[88, 55] [55, 88]
	}

}
