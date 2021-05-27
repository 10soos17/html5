package p03.multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String[]> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel(new String[] {"스마트TV1","스마트TV2"});
	//	p1.hm.put(p1.getKind(),p1.getModel());
		
		Tv tv = p1.getKind();
		String[] tvModel = p1.getModel();
		System.out.println(tv.toString());
		System.out.println(tvModel[0]);
		
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel(new String("스마트Car"));
		
	
	}

}
