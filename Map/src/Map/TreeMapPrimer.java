package Map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapPrimer {
	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println("--- Voće i kalorijske vrednosti ---");
		System.out.println("-----------------------------------");
		TreeMap<String, Integer> voceIKalorije = new TreeMap<>();

		// Dodavanje elemenata u voceIKalorije
		voceIKalorije.put("Jabuka", 52);
		voceIKalorije.put("Banana", 89);
		voceIKalorije.put("Kivi", 61);
		voceIKalorije.put("Ananas", 50);

		System.out.println("TreeMap: " + voceIKalorije);

		// Dohvatanje prvog ključa
		String prviKljuc = voceIKalorije.firstKey();
		System.out.println(".firstKey() --> Prvi ključ: " + prviKljuc);

		// Dohvatanje poslednjeg ključa
		String poslednjiKljuc = voceIKalorije.lastKey();
		System.out.println(".lastKey() --> Poslednji ključ: " + poslednjiKljuc);

		// Iteracija kroz ključeve i vrednosti u tabeli
		System.out.println(".iterator() --> ");
		Iterator<Entry<String, Integer>> iterator = voceIKalorije.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println("Voće: " + entry.getKey() + ", Kalorijska vrednost: " + entry.getValue());
		}
	}
}
