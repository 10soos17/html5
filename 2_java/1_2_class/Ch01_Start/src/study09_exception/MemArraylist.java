package study09_exception;

import java.util.ArrayList;

public class MemArraylist {

	String name;
	int ki;
	int we;
	int age;
	int tel;
	double c;
	String msg;
	ArrayList<MemArraylist> member = new ArrayList<MemArraylist>();
	

	public MemArraylist() {

	}
	public MemArraylist(String name, int ki, int we, int age, int tel, double c) {
		this.name = name;
		this.ki = ki;
		this.we = we;
		this.age = age;
		this.tel = tel;
		this.c = c;

	}

	public void in(String name, int[] arr) {
		member.add(new MemArraylist(name, arr[0], arr[1], arr[2], arr[3],jung(arr[2],arr[1])));
		System.out.println(member);

	}

	public double jung(int we, int ki) {
		double res = we/(ki*ki);
		return res;
	}

	
	public boolean prn(int num) {
		switch (num) {
		case 2:
			System.out.println("2");
			for(MemArraylist m: member) {
				msg ="[회원정보출력]\n" 
						+ "이름: " + m.name+"\n"+
						m.name+"의 키: "+m.ki+"\n"+
						m.name+"의 몸무게: "+m.we+"\n"+
						m.name+"의 나이: "+m.age+"\n"+
						m.name+"의 전화번호: "+m.tel+"\n";
						
				System.out.println(msg+"\n");
			}
			break;
		case 3:
			for(MemArraylist m: member) {
				if(m.c<=18.5) {
					msg="[회원정보출력]\n" +
						"이름: " + m.name+"\n"+
						"저체중입니다.\n"+
						"비만도는 "+ m.c;
					System.out.println(msg+"\n");
					continue;
				}else if(18.5<m.c && m.c<22.9) {
					msg="[회원정보출력]\n" +
							"이름: " + m.name+"\n"+
							"정상입니다.\n"+
							"비만도는 "+ m.c;
					System.out.println(msg+"\n");
					continue;
				}else {
					msg="[회원정보출력]\n" +
							"이름: " + m.name+"\n"+
							"과체중입니다.\n"+
							"비만도는 "+ m.c;
					System.out.println(msg+"\n");
					continue;
				}	
			}
			break;

		case 4:
			msg = "[종료]";
			System.out.println(msg);
			return false;
		}
		return true;
		
		}
}
