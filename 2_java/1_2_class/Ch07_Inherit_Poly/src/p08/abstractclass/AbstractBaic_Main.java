package p08.abstractclass;

public class AbstractBaic_Main {

	public static void main(String[] args) {
		AbstractBasic_Child ac = new AbstractBasic_Child();
		System.out.println(ac.num);
		ac.methodA();
		ac.methodB();
		
		//PolyMorphism 1
		AbstractBasic ab = new AbstractBasic_Child();
		System.out.println(ab.num);
		ab.methodB();
		ab.methodA();
		((AbstractBasic_Child) ab).print();//Casting(강제형변환)

		//PolyMorphism 2
		AbstractBasic ab2 = new AbstractBasic_Child();
		AbstractBasic_Child abc = (AbstractBasic_Child)ab2;//Casting(강제형변환)
		System.out.println(abc.num);
		abc.methodB();
		abc.methodA();
		abc.print();
	}

}
