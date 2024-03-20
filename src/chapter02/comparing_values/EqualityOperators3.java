package chapter02.comparing_values;

import java.io.File;

public class EqualityOperators3 {

	public static void main(String[] args) {
		var monday = new File("schedule.txt");
		var tuesday = new File("schedule.txt");
		var wednesday = tuesday;
		System.out.println(monday == tuesday); // false
		System.out.println(tuesday == wednesday); // true
		
		// monday == tuesday false olurken neden tuesday ==wednesday true oldu ?
		// monday ve tuesday adinda iki farki obje olustu ve == operatoru bu iki degisken ayni nesneyi mi gosteriyor diye kontrol etti. Farkli objeleri gosterdikleri icin false dondu
		// tuesday , wednesday degiskenine atandi ve bunlar ayni objeyi gostermekteler. Bundan dolayi da == kontrolunda true deger dondu.
		
	}
}
