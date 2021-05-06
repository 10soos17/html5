package p03_for_while_dowhile;

import java.io.IOException;

public class WhileKeyControlEx2 {
                                                               //3: JVM
	public static void main(String[] args) throws IOException  {//2
		boolean run=true;
		int keyCode = 0;
		int speed = 0;
		
		while(run) {
			//키보드 "Enter" 눌르면: 코드값 10(Line Feed)+13(Carrige Return) 동작
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.증속  2.감속  3.중지");
				System.out.println("----------------");
				System.out.println("선택:");
		}
			
		
			keyCode= System.in.read();//1
			//System.out.println(keyCode);
		
		if(keyCode == 49) {	//키보드에서 1을눌렀을때-증속
			speed++;
			System.out.println("현재속도; "+speed);
		}else if(keyCode == 50) {//키보드에서2을눌렀을때-감속
			speed--;
			System.out.println("현재속도; "+speed);
		
		}else if(keyCode == 51) {//키보드에서3을눌렀을때-중지
			run = false;
		}
			
		}
		System.out.println("프로그램 종료");

	}

}
