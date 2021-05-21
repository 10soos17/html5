package p03.object.finalize;

public class Counter {
	public int no;

	public Counter(int no) {
		super();
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"번 객체의 finalize가 실행됨");
	}
	
	
	
}
