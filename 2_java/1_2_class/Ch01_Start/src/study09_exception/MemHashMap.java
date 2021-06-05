package study09_exception;
import java.util.HashMap;

public class MemHashMap {

	String name;
	int ki;
	int we;
	int age;
	int tel;
	double c;
	
	String msg;

	MemHashMap vals;
	HashMap<Integer, MemHashMap> memHash = new HashMap<Integer, MemHashMap>();
	

//	@Override
//	public int hashCode() {
//
//		return name.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {// c2
//		if (!(obj instanceof Mem)) {
//			return false;
//		}
//		Mem n = (Mem) obj;
//		if (this.name.equals(n.name)) {
//			return true;
//		}
//		return false;
//	}
	public MemHashMap() {

	}
	public MemHashMap(String name, int ki, int we, int age, int tel, double c) {
		this.name = name;
		this.ki = ki;
		this.we = we;
		this.age = age;
		this.tel = tel;
		this.c = c;
	}
	public void in(String name, int[] arr) {

		
		memHash.put(memHash.size()+1, new MemHashMap(name,arr[0], arr[1], arr[2], arr[3],jung(arr[2],arr[1])));


	}

	public double jung(int we, int ki) {
		double res = we/(ki*ki);
		return res;
	}

	public boolean prn(int num) {
		switch (num) {
		case 2:
			System.out.println("2");
			for(Integer key: memHash.keySet()) {
				vals = memHash.get(key);
				msg ="[회원정보출력]\n" 
						+ "이름: " + vals.name+"\n"+
						vals.name+"의 키: "+vals.ki+"\n"+
						vals.name+"의 몸무게: "+vals.we+"\n"+
						vals.name+"의 나이: "+vals.age+"\n"+
						vals.name+"의 전화번호: "+vals.tel+"\n";
						
				System.out.println(msg+"\n");
			}
			break;
		case 3:
			for(Integer key: memHash.keySet())  {
				vals = memHash.get(key);
				if(vals.c<=18.5) {
					msg="[회원정보출력]\n" +
						"이름: " + vals.name+"\n"+
						"저체중입니다.\n"+
						"비만도는 "+ vals.c;
					System.out.println(msg+"\n");
					continue;
				}else if(18.5<vals.c && vals.c<22.9) {
					msg="[회원정보출력]\n" +
							"이름: " + vals.name+"\n"+
							"정상입니다.\n"+
							"비만도는 "+ vals.c;
					System.out.println(msg+"\n");
					continue;
				}else {
					msg="[회원정보출력]\n" +
							"이름: " + vals.name+"\n"+
							"과체중입니다.\n"+
							"비만도는 "+ vals.c;
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
