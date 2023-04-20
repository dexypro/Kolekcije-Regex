package Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTablePrimer {
	public static void main(String[] args) {
		System.out.println("-----------------");
		System.out.println("--- Hashtable ---");
		System.out.println("-----------------");
		Hashtable<String, Integer> knjige = new Hashtable<>();

		// Dodavanje elementa u knjige
		knjige.put("Harry Potter i Kamen mudrosti", 1997);
		knjige.put("Gospodar prstenova", 1954);
		knjige.put("Da Vincijev kod", 2003);
		knjige.put("1984", 1949);

		// Dohvatanje elementa
		Integer godinaIzdavanja = knjige.get("Da Vincijev kod");
		System.out.println(".get() --> Godina izdavanja Da Vincijev kod: " + godinaIzdavanja);

		// Brisanje elementa
		knjige.remove("1984");
		System.out.println(".remove() --> Hashtable nakon uklanjanja '1984': " + knjige);

		// Provera da li postoji odredjeni element
		System.out.println(".containsKey() --> Hashtable sadrži 'Gospodar prstenova': "
				+ knjige.containsKey("Gospodar prstenova"));

		// Provera da li postoji odredjena vrednost
		System.out.println(".containsValue() --> Hashtable sadrži 1997: " + knjige.containsValue(1997));

		// Veličina Hashtable
		System.out.println(".size() --> Veličina Hashtable: " + knjige.size());

		// Provera da li je prazan Hashtable
		System.out.println(".isEmpty() --> Hashtable je prazan: " + knjige.isEmpty());

		// Iteracija kroz ključeve u tabeli
		Enumeration<String> kljucevi = knjige.keys();
		System.out.print(".keys() --> ");
		while (kljucevi.hasMoreElements()) {
			String kljuc = kljucevi.nextElement();
			System.out.print("Ključ: " + kljuc + ", ");
		}

		// Iteracija kroz vrednosti u tabeli
		Enumeration<Integer> vrednosti = knjige.elements();
		System.out.print("\n.elements() --> ");
		while (vrednosti.hasMoreElements()) {
			Integer vrednost = vrednosti.nextElement();
			System.out.print("Vrednost: " + vrednost + ", ");
		}

		// Brisanje Hashtable
		knjige.clear();
		System.out.println("\n.clear() --> Hashtable nakon čišćenja: " + knjige);

		// Kopiranje elemenata iz jednog Hashtablea u drugi
		Hashtable<String, Integer> noveKnjige = new Hashtable<>();
		noveKnjige.put("Alhemičar", 1988);
		noveKnjige.put("Majstor i Margarita", 1967);

		knjige.putAll(noveKnjige);
		System.out.println(".putAll() --> Hashtable nakon kopiranja elemenata: " + knjige);

		// Provera da li Hashtable sadrži određenu vrednost
		System.out.println(".contains() --> Hashtable sadrži 1954: " + knjige.contains(1954));
	}
}
