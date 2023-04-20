package List;

import java.util.Iterator;
import java.util.Vector;

public class VektorPrimer {
	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("--- Vektor ---");
		System.out.println("--------------");
		Vector<String> hobi = new Vector<>();

		// Dodavanje elementa u Vektor
		hobi.add("Plivanje");
		hobi.add("Trčanje");
		hobi.add("Planinarenje");
		hobi.add("Vožnja bicikla");

		// Dodavanje elemenata na odredjeni index
		System.out.println(".add() --> Dodavanje 'Joga' na indexu 1.");
		hobi.add(1, "Joga");

		// Dohvatanje elemenata na odredjenom indexu
		String HobiNaIndeksu2 = hobi.get(2);
		System.out.println(".get() --> Hobi na indeksu 2: " + HobiNaIndeksu2);

		// Brisanje elemenata na odredjenom indexu
		hobi.remove(1);
		System.out.println(".remove() --> Vektor nakon uklanjanja elementa na indeksu 1: " + hobi);

		// Zamena elementa odredjenom indexu
		hobi.set(2, "Tenis");
		System.out.println(".set() --> Vektor nakon postavljanja novog elementa na indeksu 2: " + hobi);

		// Provera da li vektor sadrži odredjeni element
		System.out.println(".contains() --> Vektor sadrži 'Plivanje': " + hobi.contains("Plivanje"));

		// Pronalaženje indexa odredjenog elementa
		int plivanjeIndeks = hobi.indexOf("Plivanje");
		System.out.println(".indexOf() --> Indeks 'Plivanje': " + plivanjeIndeks);

		// Veličina
		System.out.println(".size() --> Veličina vektora: " + hobi.size());

		// Provera da li je vektor prazan
		System.out.println(".isEmpty() --> Vektor je prazan: " + hobi.isEmpty());

		// Iterator
		System.out.print(".iterator() --> Iteracija kroz vektor: ");
		Iterator<String> iterator = hobi.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}

		// Brisanje
		hobi.clear();
		System.out.println("\n.clear() --> Vektor nakon čišćenja: " + hobi);

	}
}
