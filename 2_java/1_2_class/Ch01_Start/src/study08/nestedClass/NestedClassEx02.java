package study08.nestedClass;

public class NestedClassEx02 {

	public static void main(String[] args) {
		PiggyBank pb1 = new PiggyBank();
		PiggyBank pb2 = new PiggyBank();

		PiggyBank.Slot temp = pb1.slot;
		pb1.slot = pb2.slot;
		pb2.slot = temp;
	
		pb1.slot.put(10000);
		pb2.slot.put(10);
		
		System.out.println("1: "+pb1.total);
		System.out.println("2: "+pb2.total);
		
	}

}
