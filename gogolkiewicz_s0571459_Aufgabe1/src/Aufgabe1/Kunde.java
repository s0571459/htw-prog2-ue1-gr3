package Aufgabe1;

public class Kunde {
	
	//Attribute
	private int kundennummer;	
	private long telefonnummer;
	private String email;
	private String anrede;
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private Bezahlmethode[] bezahlmethoden = new Bezahlmethode[3];
	private Adresse[] adressen = new Adresse[2];
	
	/**
	 * 
	 * @param l
	 * @param kundennummer
	 * @param vorname
	 * @param nachname
	 * @param anrede
	 * @param geburtsdatum
	 * @param adressen
	 * @param email
	 */
	
	
	//konstruktor Kunde
	public Kunde(long l, int kundennummer, String vorname, String nachname, String anrede, String geburtsdatum,Adresse[] adressen, String email)
	{
		this.kundennummer = kundennummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.anrede = anrede;
		this.geburtsdatum = geburtsdatum;
		
		for(int i = 0; i < adressen.length; i++)
		{
			this.adressen[i] = adressen[i];
		}
		
		this.email = email;
		this.telefonnummer = l;
	}
	
	//Getter und Setter
	
	public Kunde setBezahlmethoden(Bezahlmethode[] bezahlmethode)
	{
		this.bezahlmethoden = bezahlmethode;
		return this;
	}
	
	public Bezahlmethode[] getBezahlmethode()
	{
		return this.bezahlmethoden;
	}
	
	public int getKundennummer() {
		return kundennummer;
	}
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}
	public long getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(long telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAnrede() {
		return anrede;
	}
	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	public Adresse[] getAdressen() {
		return adressen;
	}
	public void setAdressen(Adresse[] adressen) {
		this.adressen = adressen;
	}
}
