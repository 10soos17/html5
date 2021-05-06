package p04.binary;

public class CharOperationEx1 {

	public static void main(String[] args) {
		char c1 = 'A' +1;
		char c2 = 'A';

		char c3 = (char) (c2+1); //char+ int =>int : 강제 형변환 
		
		System.out.printf("%c,%c,%c",c1,c2,c3);
	}

}
