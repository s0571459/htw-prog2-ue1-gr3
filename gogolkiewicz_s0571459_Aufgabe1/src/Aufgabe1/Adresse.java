package Aufgabe1;

public class Adresse {
	
	//Attribute
	private String strasse;
	private int plz;
	private String hausnummer;
	private String ort;
	
	/**
	 * 
	 * @param strasse
	 * @param plz
	 * @param string
	 * @param ort
	 */
	

	//Konstruktor Addrese
	public Adresse(String strasse, int plz, String string, String ort) {
		this.strasse = strasse;
		this.plz = plz;
		this.hausnummer = string;
		this.ort = ort;
    }
	
	//Getter und Setter
	
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getPLZ() {
		return plz;
	}
	public void setPLZ(int plz) {
		this.plz = plz;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public String getOrt() {
		return this.ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
}