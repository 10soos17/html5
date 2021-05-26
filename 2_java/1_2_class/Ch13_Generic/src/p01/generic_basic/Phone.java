package p01.generic_basic;

public class Phone {
	private String app;

	public Phone() {
		this("Phone Class입니다.");
	}

	public Phone(String app) {
		this.app = app;
	}
	
	@Override
	public String toString() {
		return app;
	}
}
