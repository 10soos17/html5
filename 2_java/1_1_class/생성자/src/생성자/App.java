package 생성자;

class A{
/*생성자 = 결과형 표시 없고, 
	      이름 클래스명과 동일, 
	      일종의 메소드 - 생성시 자동 호출 */
/*생성자 오버로드, 메소드 오버로드 - 같은 이름의 메소드가 여러개
  식별하기 위해 매개 변수의 개수가 달라야 함  
 */
	A(){System.out.println("A()");}
	A(int v){System.out.println(v);}
	A(String s, int v){System.out.println(s);}
}
public class App {

	public static void main(String[] args) {
		A A1 = new A();
		A A2 = new A(7);
		A A3 = new A("seoul", 8);
	}

}
