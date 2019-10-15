package uebung1;

public class Adresse {
	
	private String straese;
	private String plz;
	private int hausnummer;
	private String land;
	

	
	public Adresse(String straese, String plz, int hausnummer, String land) {
		super();
		this.straese = straese;
		this.plz = plz;
		this.hausnummer = hausnummer;
		this.land = land;
		
		
		
		
	}
	public String getStraese() {
	
		return straese;
	}
	public void setStraesse(String straese) {
		straese = straese;
	}
	public String getPLZ() {
		return plz;
	}
	public void setPLZ(String pLZ) {
		plz = pLZ;
	}
	public int getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(int hausnummer) {
		hausnummer = hausnummer;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		land = land;
	}
	
