package p07.polymorphism;


class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionExample {
	 public static void main(String[] args) {
		 B b = new B();
		 C c = new C();
		 D d = new D();
		 E e = new E();
		 
		 A a1 = b;//Pomotion(자동형변환) 
		 A a2 = c;
		 A a3 = d;
		 A a4 = e;
		 
		 B b1 = d;
		 //B b3 = e;//상속 관계가 아닌, 형제관계는 다형성 불가 
		 B b2 = (B) a1;//Casting(강제형변환)
		
		 
		 
		 
	 }
}
