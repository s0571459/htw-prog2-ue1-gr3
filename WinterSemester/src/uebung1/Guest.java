package uebung1;

public class Guest {
	
	private String name;
	private Adresse privatAdresse;
	private Adresse businessAdresse;
	
	
	
	public Guest(String Name) {
		this.name = name;
		
		
	}

	public void setPrivateAdresse(Adresse adresse) {
		this.privatAdresse = adresse;
		
	}
	
	public void setBusinessAdresse(Adresse adresse) {
		this.businessAdresse = adresse;

	
	}
}
