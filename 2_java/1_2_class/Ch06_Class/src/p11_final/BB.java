package p11_final;

public class BB extends B {

	void write() {
		System.out.println("child BB ");
		
		
	}
	
	//재정의 - 상속 
	@Override
	public void print() {
		System.out.println("BB Overriding method()");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
