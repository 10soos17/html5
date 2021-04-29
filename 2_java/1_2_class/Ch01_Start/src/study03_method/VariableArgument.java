package study03_method;

public class VariableArgument {
	//JDK 1.5에서 인자의 개수를 가변적으로 받을 수 있는 방식이 추가됨.
	//가변적으로 넘어온 인자들은 배열 타입으로 받아진다.
	void printInfo(String ...infos) {
		if(infos.length != 0) {
			for(int i = 0; i < infos.length; i++) {
				System.out.println(infos[i]);
			}
		}
		else {
			System.out.println("인자가 없네요.");
		}
	}
	public static void main(String[] args) {

		VariableArgument v = new VariableArgument();
		
		System.out.println("인자 없이");
		v.printInfo();
		
		String[] infos = {"인자 하나", "홍길동", "인자 두 개", "홍길동", "직업능력개발", "인자 세 개", "홍길동", "직업능력개발", "1억"};
		
		v.printInfo(infos);
	}

}
