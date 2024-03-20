package chapter01.initializing_veriables;

import java.util.ArrayList;
import java.util.List;

public class FinalLocalVeriables {

	public static void main(String[] args) {
		final int y=10;
		int x=20;
//		y=x+10;  Does Not Compiler
		
		final int z;
//		z=30; // bir kez deger atanabilir. Legal
		z=x+30; //Legal
		
		System.out.println(z);
		
//		final array tanimlayabilir miyiz ?
		final int[] favoriteNumbes=new int[10];
		favoriteNumbes[0]=10;
		favoriteNumbes[2]=10;
		favoriteNumbes[0]=30;
//		Array'in icerisinde ki data'yi degistirebiliriz ve ya deger atayabiliriz.
//		favoriteNumbes=null; Does Not Compiler
		
		System.out.println(favoriteNumbes[0]);
		
//		final list tanimlayabilir miyiz?
		final List<Integer> counters=new ArrayList<Integer>();
		counters.add(10);
		counters.add(20);
		
 	}
}


// Bir localVeriable constructor, method veya initialize block'ta tanimlanan degiskenlerdir.
// stack memory de yasarlar.
// Local degiskenler sadece final anahtar kelimesini alir.
// Bir degisken final oldugunda constants anlamina gelir degistirilemez... sadece 1 kez deger atayabiliriz.
