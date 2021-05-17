package p08.abstractclass;

public class Triangle extends Figure {

	@Override
	void area(int height, int width) {
		System.out.println("삼각형의 넓이: "+height * width*1/2);
		

	}


}
