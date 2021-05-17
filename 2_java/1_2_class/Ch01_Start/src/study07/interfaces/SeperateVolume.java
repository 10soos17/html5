package study07.interfaces;

public class SeperateVolume implements Lendable {
	String requestNo;// 청구번호
	String bookTitle;// 제목
	String writer;// 저자
	String borrower;// 대출일
	String checkOutDate;// 대출상태
	byte state;// 기본값 0

	public SeperateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;

	}

	// 대출
	@Override
	public void checkOut(String borrower, String checkOutDate) {
		if (state != 0) {
			//System.out.println(this.borrower + "님이 대출중입니다.");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.state = 1;

		System.out.println("* " + this.bookTitle + " 이(가) 대출되었습니다.");
		System.out.println("대출인: " + borrower);
		System.out.println("대출일: " + checkOutDate);

	}

	// 반납
	@Override
	public void checkIn() {
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("* " + this.bookTitle + "이(가) 반납되었습니다.");

	}
}
