package p01.variable;

public class VariableScopeEx {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;
		if(v1 > 10) {
			v2 = v1 - 10;		
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);

	}

}
