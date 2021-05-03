package study03_method;

public class Args {
	
	int x;
	
	//Method Overloading
	//add(int x)에서 x:parameter, local 변수 
	
	void add(int x) {
		x = x+ 50;
		
	}
	void add(Args arg) {
		arg.x = arg.x+ 40;
		
	}
	void add(int[] arr) {
		arr[0]++;
		
	}
	
	void addNew(Args arg) {
		arg = new Args();
	}


}
