package Aufgabe1;

public class Bezahlmethode {
	

	//Attribute
	private String bezeichner;
	private String beschreibung;
	
	/**
	 * 
	 * @param bezeichner
	 * @param beschreibung
	 */
	
	
	//Konstruktor Bezahlmethode
	public Bezahlmethode(String bezeichner, String beschreibung)
	{
		this.bezeichner = bezeichner;
		this.beschreibung = beschreibung;
	}
	
	//Getter und Setter

	public String getBezeichner() {
		return bezeichner;
	}

	public void setBezeichner(String bezeichner) {
		this.bezeichner = bezeichner;
	}


	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	
}
