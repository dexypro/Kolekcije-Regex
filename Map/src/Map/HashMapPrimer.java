package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapPrimer {
	public static void main(String[] args) {
		System.out.println("--------------------");
		System.out.println("--- Države i glavni gradovi ---");
		System.out.println("--------------------");
		HashMap<String, String> drzaveIPrestonice = new HashMap<>();

		// Dodavanje elemenata
		drzaveIPrestonice.put("Srbija", "Beograd");
		drzaveIPrestonice.put("Francuska", "Pariz");
		drzaveIPrestonice.put("Nemačka", "Berlin");
		drzaveIPrestonice.put("Italija", "Rim");

		// Dohvatanje elementa
		String prestonica = drzaveIPrestonice.get("Nemačka");
		System.out.println(".get() --> Prestonica Nemačke: " + prestonica);

		// Brisanje elementa
		drzaveIPrestonice.remove("Italija");
		System.out.println(".remove() --> HashMap nakon uklanjanja Italije: " + drzaveIPrestonice);

		// Provera da li postoji određeni element
		System.out.println(".containsKey() --> HashMap sadrži 'Srbija': " + drzaveIPrestonice.containsKey("Srbija"));

		// Provera da li postoji određena vrednost
		System.out.println(
				".containsValue() --> HashMap sadrži 'Beograd': " + drzaveIPrestonice.containsValue("Beograd"));

		// Veličina HashMap
		System.out.println(".size() --> Veličina HashMap: " + drzaveIPrestonice.size());

		// Provera da li je prazan HashMap
		System.out.println(".isEmpty() --> HashMap je prazan: " + drzaveIPrestonice.isEmpty());

		// Iteracija kroz ključeve i vrednosti u tabeli
		Iterator<Entry<String, String>> iterator = drzaveIPrestonice.entrySet().iterator();
		System.out.println(".iterator() -->");
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println("Država: " + entry.getKey() + ", Glavni grad: " + entry.getValue());
		}

		// Kopiranje elemenata iz jednog HashMapa u drugi
		HashMap<String, String> noveDrzave = new HashMap<>();
		noveDrzave.put("Španija", "Madrid");
		noveDrzave.put("Portugal", "Lisabon");

		drzaveIPrestonice.putAll(noveDrzave);
		System.out.println(".putAll() --> HashMap nakon kopiranja elemenata: " + drzaveIPrestonice);

	}
}