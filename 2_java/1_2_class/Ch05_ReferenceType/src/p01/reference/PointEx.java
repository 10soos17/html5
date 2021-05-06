package p01.reference;

public class PointEx {

	public static void main(String[] args) {

		// 1.클래스에 초기값 저장 방법1 - 생성자
		Point p1 = new Point(10, 20);
		System.out.println(p1.x);
		System.out.println(p1.y);

		// 2.getter() & setter()를 초기값 저장
		Point p2 = new Point();
		p2.setX(30);
		p2.setY(40);
		
		
		int x1 = p2.getX();
		int y1 = p2.getY();
		System.out.println(x1);
		System.out.println(y1);

		//3.변수에 직접 값 넣고 가져오기
		Point p3 = new Point();
		p3.x = 50;
		p3.y = 60;
		System.out.println(p3.x);
		System.out.println(p3.y);
	}

}
