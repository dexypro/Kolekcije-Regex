package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPrimer {
	public static void main(String[] args) {
		String tekst = "Opis zadatka: Implementacija zadatka podrazumeva:\n"
				+ "- Teorijsko upoznavanje sa navedenim temama. Tom prilikom je potrebno kreirati projekat, gde će na primeru biti prikazan postupak kreiranja liste, mape i upotreba regularnih izraza(u odvojenim projektima). Prikazati na primerima postupke kreiranja kao i primenu ugrađenim funkcija.\n"
				+ "\n" + "Datum postavljanja zadatka: 20-04-2023\n" + "Email radnika: bajovicdejan91@gmail.com\n"
				+ "Github radnika: https://github.com/dexypro";

		// Datum šablon (u formatu dd-mm-yyyy)
		String datumRegex = "\\b\\d{2}-\\d{2}-\\d{4}\\b";
		Pattern datumSablon = Pattern.compile(datumRegex);
		Matcher datumPretrazi = datumSablon.matcher(tekst);

		System.out.println("Pronađeni datumi:");
		while (datumPretrazi.find()) {
			System.out.println(datumPretrazi.group());
		}

		// Email šablon
		String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
		Pattern emailSablon = Pattern.compile(emailRegex);
		Matcher emailPretrazi = emailSablon.matcher(tekst);

		System.out.println("\nPronađene email adrese:");
		while (emailPretrazi.find()) {
			System.out.println(emailPretrazi.group());
		}

		// GitHub URL šablon
		String githubUrlRegex = "https://github.com/[a-zA-Z0-9._-]+";
		Pattern githubUrlSablon = Pattern.compile(githubUrlRegex);
		Matcher githubUrlPretrazi = githubUrlSablon.matcher(tekst);

		System.out.println("\nPronađeni GitHub URL-ovi:");
		while (githubUrlPretrazi.find()) {
			System.out.println(githubUrlPretrazi.group());
		}
	}
}
