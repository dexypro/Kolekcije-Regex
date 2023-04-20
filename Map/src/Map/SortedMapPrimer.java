package Map;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortedMapPrimer {
	public static void main(String[] args) {
		System.out.println("--------------------------------");
		System.out.println("--- Životinje i životne dobi ---");
		System.out.println("--------------------------------");
		SortedMap<String, Integer> zivotinjeIZivotneDobi = new TreeMap<>();

		// Dodavanje elemenata u zivotinjeIZivotneDobi
		zivotinjeIZivotneDobi.put("Slon", 70);
		zivotinjeIZivotneDobi.put("Zebra", 25);
		zivotinjeIZivotneDobi.put("Tigar", 26);
		zivotinjeIZivotneDobi.put("Krokodil", 70);

		System.out.println("SortedMap: " + zivotinjeIZivotneDobi);

		// Dohvatanje prvog ključa i poslednjeg ključa
		String prviKljuc = zivotinjeIZivotneDobi.firstKey();
		String poslednjiKljuc = zivotinjeIZivotneDobi.lastKey();
		System.out.println(".firstKey() --> Prvi ključ: " + prviKljuc);
		System.out.println(".lastKey() --> Poslednji ključ: " + poslednjiKljuc);

		// Iteracija kroz ključeve i vrednosti u tabeli
		Iterator<Entry<String, Integer>> iterator = zivotinjeIZivotneDobi.entrySet().iterator();
		System.out.print(".iterator() --> ");
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.print("Životinja: " + entry.getKey() + ", Životna dob: " + entry.getValue() + " | ");
		}
	}
}
