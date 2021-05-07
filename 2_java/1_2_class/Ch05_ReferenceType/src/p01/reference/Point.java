package p01.reference;
//모든 클래스는 Object로부터 자연상속을 받았습ㄴ디ㅏ. - 부모의 변수와 메소드를 자동 사용 
public class Point extends Object{ //모든 클래스는 extends Object가 생략되어있는 것 

	int x, y;
	
	//Constructor Overloading 
	//기본생성자 
	public Point() {
		
		
	}
	//Parameter가 있는 생성자 
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public Point(String a, int b) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//재정의 
	@Override
	public String toString() {
		return x + " : "+ y;
	}

	//getter&setter 
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
