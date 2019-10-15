package uebung1;

public class Hotel {
	
	private Guest  [] guests = new Guest[1000];
	
	public boolean addGuest(Guest guest) {
		int numberOfGuests = findNumberOfGuests();
		guests[numberOfGuests] = guest;
		
	}

}
