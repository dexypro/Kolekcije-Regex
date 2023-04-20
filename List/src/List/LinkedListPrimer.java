package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPrimer {
	public static void main(String[] args) {
		System.out.println("------------------");
		System.out.println("--- LinkedList ---");
		System.out.println("------------------");
		LinkedList<String> salonAutomobila = new LinkedList<>();

		// Dodavanje elementa na početak liste
		salonAutomobila.addFirst("Audi A4");
		salonAutomobila.add("BMW M3");
		salonAutomobila.add("Mercedes C-Klase");
		salonAutomobila.add("Volkswagen Passat");

		// Dodavanje elementa na kraj liste
		salonAutomobila.addLast("Tesla Model 3");

		// Dohvatanje prvog elementa
		System.out.println(".getFirst() --> Prvi element liste: " + salonAutomobila.getFirst());

		// Dohvatanje poslednjeg elementa
		System.out.println(".getLast() --> Poslednji element liste: " + salonAutomobila.getLast());

		// Pronalaženje poslednjeg indeksa određenog elementa
		salonAutomobila.add("BMW M3");
		int poslednjiIndeksBMWM3 = salonAutomobila.lastIndexOf("BMW M3");
		System.out.println(".lastIndexOf() --> Poslednji indeks 'BMW M3': " + poslednjiIndeksBMWM3);

		// Iterator
		System.out.print(".iterator() --> Iteracija kroz listu: ");
		Iterator<String> iterator = salonAutomobila.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ", ");
		}

		// ListIterator
		System.out.print("\n.listIterator() --> ListIterator: ");
		ListIterator<String> listIterator = salonAutomobila.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + ",");
		}

		// Uklanjanje prvog elementa
		salonAutomobila.removeFirst();
		System.out.println("\n.removeFirst() --> Lista nakon uklanjanja prvog elementa: " + salonAutomobila);

		// Uklanjanje poslednjeg elementa
		salonAutomobila.removeLast();
		System.out.println(".removeLast() --> Lista nakon uklanjanja poslednjeg elementa: " + salonAutomobila);

		// Pretvaranje liste u niz
		String[] nizAutomobila = salonAutomobila.toArray(new String[0]);
		System.out.print(".toArray() --> Niz automobila: ");
		for (String auto : nizAutomobila) {
			System.out.print(auto + " | ");
		}
	}
}
