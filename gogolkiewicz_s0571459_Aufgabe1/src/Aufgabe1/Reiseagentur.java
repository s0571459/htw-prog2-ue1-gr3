package Aufgabe1;

public class Reiseagentur {
	
	//Attribute
	private Kunde [] kunden = new Kunde[1000];
	private String name;
	private String UST_IDNR;
	private Adresse adresse;
	
	/**
	 * 
	 * @param name
	 * @param UST_IDNR
	 * @param adresse
	 */
	
	//Konstruktor - Reiseagentur
	public Reiseagentur(String name,String UST_IDNR,Adresse adresse) {
		this.setName(name);
		this.setUST_IDNR(UST_IDNR);
		this.setAdresse(adresse);
	}
	
	
	public Kunde[] getKunden()
	{
		return this.kunden;
	}
	
	//Methode - addKunde
	public void addKunde(String name, String vorname, long l,String anrede, String geburtstag, Adresse[] adressen, String email,Bezahlmethode[] bezahlmethode)
	{
		for(int i = 0; i < kunden.length; i++)
		{
			if(kunden[i] == null)
			{
				kunden[i] = new Kunde(l,i,vorname,name,anrede,geburtstag,adressen,email).setBezahlmethoden(bezahlmethode);
				break;
			}
		}
	}

	//Getter und Setter
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getUST_IDNR() {
		return UST_IDNR;
	}

	public void setUST_IDNR(String uST_IDNR) {
		UST_IDNR = uST_IDNR;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
//int telefonnummer, int kundennummer, String vorname, String nachname, String anrede, String geburtsdatum,Adresse[] adressen, String email