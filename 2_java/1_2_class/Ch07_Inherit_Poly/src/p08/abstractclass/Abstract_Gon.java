package p08.abstractclass;

public class Abstract_Gon {

	public static void main(String[] args) {
		Tetragon tet = new Tetragon();
		Triangle tri = new Triangle();
		
		tet.area(10,5);
		tri.area(10,5);	
		
		tet.test();

	}

}
