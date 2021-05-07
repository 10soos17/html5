package p05.string;

public class Person_Main {

	public static void main(String[] args) {
		int a;
		String str;

		Person p;// 선언
		p = new Person();
		p = new Person();

		Person p2 = new Person();
//		Person p2 = new Person();
		Person p3 = new Person();

		System.out.println("---1. 변수사용한방법1------------------");
		Person[] pa;// 선언
		pa = new Person[10];

		pa[0] = new Person();
		pa[0].age = 30;
		pa[0].name = "홍길동0";
		System.out.println(pa[0].age + " : " + pa[0].name);

		pa[1] = new Person();
		pa[0].age = 30;
		pa[0].name = "홍길동0";
		System.out.println(pa[0].age + " : " + pa[0].name);

		System.out.println("---2. 변수사용한방법2 (일반for문)------------------");
		for (int i = 0; i < pa.length; i++) {
			pa[i] = new Person();
			pa[i].age = 30 + i;
			pa[i].name = "홍길동" + i;
			System.out.println(pa[i].age + " : " + pa[i].name);
		}

		System.out.println("---3. 변수사용한방법3 (향상된for문)------------------");
		int count = 0;
		for (Person pp : pa) {
			//pp = new Person();
			pp.age = 30 + count;
			pp.name = "홍길동" + count;
			count++;
			System.out.println(pp.age + " : " + pp.name);
		}
		

		System.out.println("---4. 변수사용한방법4 (일반for문, 향상된for: 생성자)------------------");
		
		for(int i=0;i<pa.length;i++) {
			pa[i] = new Person(30 + i, "홍길동"+i);
			//pa[count].age = 30+count; 
			//pa[count].name = "홍길동"+count;
			System.out.println(pa[i].age+" : "+pa[i].name); 
		}		
		
		count = 0;
		for(Person pp: pa) {
			pp = new Person(30 + count, "홍길동"+count);
			System.out.println(pp.age+" : "+pp.name); 
			count++;
		}	

		
		System.out.println("---5. 변수사용한방법5 (향상된for, toString)------------------");
		count = 0;
		for (Person pp : pa) {
			//pp = new Person();
			pp.age = 30 + count;
			pp.name = "홍길동" + count;
			System.out.println(pp);// = pp.toString();
			count++;
		}

	}

}
