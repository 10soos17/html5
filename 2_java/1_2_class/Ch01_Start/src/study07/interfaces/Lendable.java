package study07.interfaces;

public interface Lendable {
	//대출
	public abstract void checkOut(String borrower, String checkOutDate);
	//반납
	public abstract void checkIn();
	
}
