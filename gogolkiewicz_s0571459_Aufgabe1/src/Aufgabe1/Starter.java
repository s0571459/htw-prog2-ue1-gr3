package Aufgabe1;
/**
 * 
 * @author Ercan matr.Nr s0571459
 *
 */

public class Starter {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
	
		
		// drei objekte die mit werten zugeteilt sind
		
		Adresse agenturAdresse = new Adresse("Hauptstrasse", 13581, "5a", "Berlin");
		Reiseagentur reiseagentur = new Reiseagentur("Magic Holidays Reiseagentur", "DE8125240001", agenturAdresse);
		Adresse[] adressen = new Adresse[] { new Adresse("Blissestr", 13581, "5a", "Berlin") };
		Bezahlmethode[] bezahlmethode = new Bezahlmethode[] {
				new Bezahlmethode("Paypal", "mustermann-familienkonto@gmail.com") };
		reiseagentur.addKunde("Mustermann", "Max", 493234944L, "Herr", "29.05.1996", adressen, "mustermann@gmail.com",
				bezahlmethode);
		reiseagentur.addKunde("Mustermann", "Kevin", 493234944L, "Herr", "29.05.1997", adressen,
				"mustermann2@gmail.com", bezahlmethode);
		reiseagentur.addKunde("Mustermann", "Jule", 493234944L, "Frau", "29.05.1998", adressen, "mustermann3@gmail.com",
				bezahlmethode);

		System.out.println("Angaben zur Reiseagentur:");
		System.out.println("+Name+ " + reiseagentur.getName());
		System.out.println("+Adresse+ " + reiseagentur.getAdresse().getStrasse() + " " + reiseagentur.getAdresse().getHausnummer()+ " " + reiseagentur.getAdresse().getPLZ() + " " + reiseagentur.getAdresse().getOrt());
		System.out.println("+UST_IDNR+ " + reiseagentur.getUST_IDNR());
		System.out.println("--------------------------");
		System.out.println("");
		System.out.println("Kunden:");
		Kunde[] kunden = reiseagentur.getKunden();
		
		// eine for schleife mit dem Array Kunde der einmal Komplett ausgegeben werden soll, also die Kunde.length
		for (int i = 0; i < kunden.length; i++) {
			if (kunden[i] == null) {
				continue;
			} else {
				System.out.println("+Anrede+ " + kunden[i].getAnrede());
				System.out.println("+Name+ " + kunden[i].getNachname());
				System.out.println("+Vorname+ " + kunden[i].getVorname());
				System.out.println("+Email+ " + kunden[i].getEmail());
				System.out.println("+Geburtsdatum+ " + kunden[i].getGeburtsdatum());
				System.out.println("+Telefonnummer+ " + kunden[i].getTelefonnummer());
				System.out.println("+Kundennummer+ " + kunden[i].getKundennummer());

				//Hier werden die Addressen der Kunden in der for Schleife ausgegeben
				
				for (int j = 0; j < kunden[i].getAdressen().length; j++) {
					if (kunden[i].getAdressen()[j] == null)
						continue;
					System.out.println("+Adresse+ " + kunden[i].getAdressen()[j].getStrasse() + " "
							+ kunden[i].getAdressen()[j].getHausnummer() + " " + kunden[i].getAdressen()[j].getPLZ()
							+ " " + kunden[i].getAdressen()[j].getOrt());
				}
				
				//Hier werden die Bezahlmehtoden ausgegeben
				
				for (int j = 0; j < kunden[i].getBezahlmethode().length; j++) {
					if (kunden[i].getBezahlmethode()[j] == null)
						continue;
					System.out.println("+Bezahlmethode+ " + kunden[i].getBezahlmethode()[j].getBezeichner());
					System.out.println("+Beschreibung+ " + kunden[i].getBezahlmethode()[j].getBeschreibung());
				}
			}
		}

	}
}
//String name, String vorname, int telefonnummer,String anrede, String geburtstag, Adresse[] adressen, String email