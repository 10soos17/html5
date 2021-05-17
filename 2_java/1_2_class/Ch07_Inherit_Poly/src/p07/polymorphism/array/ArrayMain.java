package p07.polymorphism.array;
//Array의 다형성 
public class ArrayMain {

	public static void main(String[] args) {
		ArrayMethod[] am = new ArrayMethod[2];
		am[0] = new ArrayMethodInheritA();
		am[1] = new ArrayMethodInheritB();
		
		for(ArrayMethod a : am) {
			//System.out.println(a);
			a.sleep();
			a.showSleepStyle();
		}
		
		for(int i=0; i<am.length; i++) {
			am[i].sleep();
			am[i].showSleepStyle();
		}
	}

}
