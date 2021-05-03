package study02_variable;
//변수 종류 테스트 
public class VariableKind {
	//인스턴스 멤버 변수 - 객체생성이 되어야만 사용 가능, RAM(x)
	int memVar;
	//static 멤버 변수 : 공용변수(공유, 정적) , RAM(o)
	static int staticVar;
	
	public static void main(String[] args) {
		//로컬 변수 , 반드시 초기화 
		int localVar = 0;

		VariableKind vk1 = new VariableKind();//0
		
		vk1.memVar = 100;
		System.out.println("vk1.memVar = " + vk1.memVar + "\n");//100
		System.out.println("vk1.staticVar = " + vk1.staticVar + "\n");
		System.out.println("VariableKind.staticVar = " + VariableKind.staticVar + "\n");//0
		System.out.println("staticVar = " + staticVar + "\n");//같은클래스인경우 "클래스명" 생략 
		
		VariableKind vk2 = new VariableKind();
		
		vk1.staticVar = 20;
		
		System.out.println("vk2.memVar  = " +vk2.memVar); //0
		vk2.memVar = 300;
		System.out.println("vk1.memVar  = " +vk1.memVar);//0
		System.out.println("vk2.memVar  = " +vk2.memVar);//300

		System.out.println("-------------------------------------");
		System.out.println(localVar);
		System.out.println(vk1.memVar);
		System.out.println(staticVar);
		System.out.println(vk1.staticVar);
		System.out.println(vk2.staticVar);
		System.out.println("vk1.staticVar = " + vk1.staticVar + "\n");
		System.out.println("VariableKind.staticVar = " + VariableKind.staticVar + "\n");
		System.out.println("staticVar = " + staticVar + "\n");
		
	}

}
