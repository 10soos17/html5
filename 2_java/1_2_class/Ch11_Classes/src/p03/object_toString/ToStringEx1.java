package p03.object_toString;

import java.io.File;

public class ToStringEx1 {

	public static void main(String[] args) {
		//개발자가 만들어 놓은 클래스: 주소값이 아니라 생성자값이 출력
		File f = new File("C:\\Spring");
		System.out.println(f);
		System.out.println(f.toString());
		
	}

}
