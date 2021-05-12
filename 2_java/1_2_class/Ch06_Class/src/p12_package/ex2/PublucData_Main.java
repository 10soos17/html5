package p12_package.ex2;

import p12_package.ex1.PublicData;

//public: 다른패키지에 접근 가능 
//			클래스, 변수, 생성자, 메소드에서 사용
public class PublucData_Main {

	public static void main(String[] args) {
		PublicData pd = new PublicData();
		System.out.println(pd.publicVar);
		pd.add();

	}

}
