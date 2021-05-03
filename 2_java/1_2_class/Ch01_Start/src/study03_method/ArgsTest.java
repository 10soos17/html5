package study03_method;

	
public class ArgsTest{
	//인수 전달 방식 테스트 
	public static void main(String[] args) {
		
		Args arg = new Args();//arg:주소값 
		arg.x = 100;
		
		String str1 = new String();//객체생성 
		String str2[] = new String[2];//배열 객체생성 
		str2[0] = "홍길동1";
		str2[1] = "홍길동2";
		
		
	
		int arr[] = new int[1]; //배열생성: int타입의 배열 생성 
		
		arg.add(arg.x);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arg); //주소값 
		System.out.println("arg.x = " + arg.x);
		
		arg.addNew(arg);
		System.out.println("arg.x = " + arg.x);
		
		arg.add(arr); //배열의 주소값 
		System.out.println("arr[0] = " + arr[0]);
	
	}
}
