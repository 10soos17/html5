package study08.nestedClass;

public class NestedClassEx01 {

	public static void main(String[] args) {
		PiggyBank pb1 = new PiggyBank();
		PiggyBank pb2 = new PiggyBank();
		PiggyBank pb3 = new PiggyBank();
		pb1.slot.put(0);
		pb2.slot.put(100);
		pb3.slot.put(0);
		
		System.out.println("1: "+pb1.total);
		System.out.println("2: "+pb2.total);
		System.out.println("3: "+pb3.total);
		
	}

}
