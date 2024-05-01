package chapter07.questions.question10;

import java.util.ArrayList;
import java.util.List;

public class Leopard implements Walk {
//	public Integer move() { // X
//		return null;
//		}
	
//	public ArrayList move() { // X
//		return null;
//		}
	public List move() { // X
		return null;
		}
	
}

class Panther implements Run{
	
	@Override
	public ArrayList move() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public List move() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}


interface Walk { private static List move() { return null; } }
interface Run extends Walk { public ArrayList move(); }