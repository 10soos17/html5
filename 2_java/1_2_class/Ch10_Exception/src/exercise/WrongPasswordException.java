package exercise;

public class WrongPasswordException extends Exception {

	private static final long serialVersionUID = 1L;

	// 생성자: 객체 생성시 초기 값 저장
	public WrongPasswordException() {
	}

	public WrongPasswordException(String message) {
		super(message);
	}
}
