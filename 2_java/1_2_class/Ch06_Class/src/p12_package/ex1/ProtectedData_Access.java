package p12_package.ex1;

//protected: 하나의 패키지 안에서 접근 가능
//		   : 패키지가 다른 경우는 상속관계 설정에서 사용 가능  
//			 변수, 생성자, 메소드에서 사용
public class ProtectedData_Access {

	public static void main(String[] args) {

		ProtectedData pd = new ProtectedData();
		System.out.println(pd.protectedVar);
		pd.add();


	}

}
