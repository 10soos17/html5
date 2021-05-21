package study09_exception;

import java.util.ArrayList;
import java.util.HashMap;

public class Mem {

	String name;
	int ki;
	int we;
	int age;
	int tel;
	double c;
	String msg;
	ArrayList<Mem> member = new ArrayList<Mem>();
	
	HashMap<String, ArrayList<Mem>> memHash = new HashMap<String, ArrayList<Mem>>();
	
//	HashMap<String, ArrayList<String>> hashtable3 = new HashMap<String, ArrayList<String>>();
//	hashtable3.put(new String("홍길동"), new ArrayList<String>());
//	
//	ArrayList<String> arr = hashtable3.get(new String("홍길동"));
//	arr.add("test");
//	arr.add("test2");
//	arr.add("test3");

	public Mem() {

	}

	public Mem(int ki, int we, int age, int tel, double c) {

		this.ki = ki;
		this.we = we;
		this.age = age;
		this.tel = tel;
		this.c = c;

	}
	public Mem(String name, int ki, int we, int age, int tel, double c) {
		this.name = name;
		this.ki = ki;
		this.we = we;
		this.age = age;
		this.tel = tel;
		this.c = c;

	}

	public void in(String name, int[] arr) {
		member.add(new Mem(name, arr[0], arr[1], arr[2], arr[3],jung(arr[2],arr[1])));
		System.out.println(member);
		
		//memHash.put(new String(name), new Mem(arr[0], arr[1], arr[2], arr[3],jung(arr[2],arr[1])));


	}

	public double jung(int we, int ki) {
		double res = we/(ki*ki);
		return res;
	}

	public boolean prn(int num) {

		switch (num) {
		case 2:
			System.out.println("2");
			for(Mem m: member) {
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
			for(Mem m: member) {
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
