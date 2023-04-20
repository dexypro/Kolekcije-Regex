package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPrimer {
	public static void main(String[] args) {
		System.out.println("-----------------");
		System.out.println("--- ArrayList ---");
		System.out.println("-----------------");
		ArrayList<String> poslasticarnica = new ArrayList<>();

		// Funkcija dodavanja elemenata .add
		poslasticarnica.add("Baklava");
		poslasticarnica.add("Tiramisu");
		poslasticarnica.add("Voćni sladoled");
		poslasticarnica.add("Čokoladni sladoled");

		// Dodavanje elementa na odredjeni index
		System.out.println(".add() --> Dodavanje elementa 'Pita sa jabukama' na indexu 1.");
		poslasticarnica.add(1, "Pita sa jabukama");

		// Dohvatanje elemenata na odredjenom indexu
		String poslasticaNaIndeksu2 = poslasticarnica.get(2);
		System.out.println(".get() --> Poslastica na indeksu 2: " + poslasticaNaIndeksu2);

		// Brisanje elemenata na odredjenom indexu
		poslasticarnica.remove(1);
		System.out.println(".remove() --> Lista nakon uklanjanja elementa na indeksu 1: " + poslasticarnica);

		// Zamenjivanje elementa na odredjenom indexu
		poslasticarnica.set(2, "Palačinke sa nutelom");
		System.out.println(".set() --> Lista nakon postavljanja novog elementa na indeksu 2: " + poslasticarnica);

		// Pretraga da li lista sadrzi odredjeni element
		System.out.println(".contains() --> Lista sadrži 'Baklava': " + poslasticarnica.contains("Baklava"));

		// Pronalaženje indexa na mestu odredjenog elementa
		int baklavaIndeks = poslasticarnica.indexOf("Baklava");
		System.out.println(".indexOf() --> Indeks 'Baklava': " + baklavaIndeks);

		// Dužina liste
		System.out.println(".size() --> Veličina liste: " + poslasticarnica.size());

		// Provera da li je lista prazna
		System.out.println(".isEmpty() --> Lista je prazna: " + poslasticarnica.isEmpty());

		// Brisanje svih elemenata
		poslasticarnica.clear();
		System.out.println(".clear() --> Lista nakon čišćenja: " + poslasticarnica);

		// Kreiranje nove ArrayList-e sa dodatnim poslasticama
		ArrayList<String> dodatnePoslastice = new ArrayList<>();
		dodatnePoslastice.add("Krofna");
		dodatnePoslastice.add("Rafaelo");

		// Dodavanje svih elemenata iz dodatnePoslastice u poslasticarnica koristeći
		// .addAll()
		poslasticarnica.addAll(dodatnePoslastice);
		System.out.println(".addAll() --> Lista nakon dodavanja dodatnih poslastica: " + poslasticarnica);

		// Konvertovanje ArrayList-a u niz koristeći .toArray()
		String[] nizPoslastica = new String[poslasticarnica.size()];
		nizPoslastica = poslasticarnica.toArray(nizPoslastica);
		System.out.println(".toArray() --> Niz nakon konvertovanja ArrayList-a: " + Arrays.toString(nizPoslastica));

		// Sortiranje elemenata liste
		Collections.sort(poslasticarnica);
		System.out.println(".sort() --> Lista nakon sortiranja: " + poslasticarnica);

		// Pretraga elemenata u sortiranoj listi
		int index = Collections.binarySearch(poslasticarnica, "Baklava");
		System.out.println(".binarySearch() --> Indeks 'Baklava': " + index);

		// Obrtanje redosleda elemenata u listi
		Collections.reverse(poslasticarnica);
		System.out.println(".reverse() --> Lista nakon obrtanja redosleda: " + poslasticarnica);

		// Mešanje elemenata u listi
		Collections.shuffle(poslasticarnica);
		System.out.println(".shuffle() --> Lista nakon mešanja elemenata: " + poslasticarnica);
	}
}
