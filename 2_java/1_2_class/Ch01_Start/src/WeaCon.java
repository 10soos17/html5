import java.util.ArrayList;

public class WeaCon {

	public String w;
	String[] arr;
	ArrayList<String> warr = new ArrayList<String>();
	

	public WeaCon(String w) {
		this.w = w;
	}

	public void inPut() {
		arr = this.w.split(" ");
		for (int i = 0; i < arr.length; i++) {
			warr.add(arr[i]);
			System.out.println(warr.get(i));
			if(i%7==0) {
				
			}
		}
	}

	public void search() {

	}
}
