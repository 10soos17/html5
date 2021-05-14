package p07.polymorphism;

public class BaseBall extends Game {

	public void write() {
		System.out.println("BaseBall Method()");
	}
	
	@Override
	public void type() {
		System.out.println("Inherit() - Super Game");
	}
}
