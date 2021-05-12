package p12_package.ex2;

import p12_package.ex1.PrivateData;

//private: 하나의 클래스 안에서만 접근 가능 
//			변수, 생성자, 메소드에서 사용
public class PrivateData_Main {

	public static void main(String[] args) {

		PrivateData pd = new PrivateData();
		//System.out.println(pd.privateVar);
		//pd.add();

	}

}
