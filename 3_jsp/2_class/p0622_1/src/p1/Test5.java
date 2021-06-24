package p1;

public class Test5 {

	public static void main(String[] args) {
		
		//ex1.
		// 변수 aa - stack
		//
		AA aa = new AA();

		System.out.println(aa.a1);
		System.out.println(aa.a2);

		System.out.println(aa.a2.b1); 
	
		aa.a2 = new BB();//그 전 BB 객체 소멸, 새로운 BB 객체의 메모리 공간 부여 
		System.out.println(aa.a2.b1);

		//ex2.
		AA [] arr = null;
		AA [] arr2 = new AA[3];
		
		//arr2[0].a1 = 10; //NullPointerException
		
		arr2[0] = new AA();
		arr2[1] = new AA();
		arr2[2] = new AA();
		
		arr2[0].a1 = 10;
		
		AA[] arr3 = null;
		{
			AA[] arr4 = new AA[3];
			arr3 = arr4;
			arr3[0] = new AA();
			arr3[1] = new AA();
			arr3[2] = new AA();
			arr2[0].a1 = 10;
		}
		
		AA[] aaa = null;
		{
			AA[] arr5 = new AA[3];

			arr5[0] = new AA();
			arr5[1] = new AA();
			arr5[2] = new AA();
			arr5[0].a1 = 10;
			
			aaa = arr5;
		}
		
				
	}

}

class AA {
	int a1;
	BB a2 = new BB();
}

class BB {
	int b1;
}