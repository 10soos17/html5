package study07.interfaces;

public class AppCDInfo extends CDInfo implements Lendable {
	String borrower;
	String checkOutDate;
	byte state;// 기본값 0

	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	//대출
	@Override
	public void checkOut(String borrower, String checkOutDate) {

		if (state != 0) {
			//System.out.println(this.borrower + "님이 대출중입니다.");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = 1;

		System.out.println("* " + super.title + "CD가 대출되었습니다.");
		System.out.println("대출인: " + borrower);
		System.out.println("대출일: " + checkOutDate);

	}

	//반납
	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("* " + super.title + "CD가 반납되었습니다.");

	}

}
