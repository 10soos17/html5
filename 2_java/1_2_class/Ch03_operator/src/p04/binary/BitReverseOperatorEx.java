package p04.binary;

public class BitReverseOperatorEx {

	public static void main(String[] args) {
		BitReverseOperatorEx bo = new BitReverseOperatorEx();
		/*
		int v1 = 10; //00000000 00000000 00000000 00001010
		int v2 = ~v1; //11111111 11111111 11111111 11110101(-11) ~: not(bit연산에서)
		int v3 = ~v1 + 1; //11111111 11111111 11111111 11110110(-10)
		System.out.println(bo.toBinaryString(v1) + "(십진수: " + v1 + ")");
		System.out.println(bo.toBinaryString(v2) + "(십진수: " + v2 + ")");
		System.out.println(bo.toBinaryString(v3) + "(십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10; //11111111 11111111 11111111 11110110(-10)
		int v5 = ~v4; //00000000 00000000 00000000 00001001(9) ~: not(bit연산에서)
		int v6 = ~v4 + 1; //00000000 00000000 00000000 00001010(10)
		System.out.println(bo.toBinaryString(v4) + "(십진수: " + v4 + ")");
		System.out.println(bo.toBinaryString(v5) + "(십진수: " + v5 + ")");
		System.out.println(bo.toBinaryString(v6) + "(십진수: " + v6 + ")");
		System.out.println();
		*/
		bo.toBinaryString2();
		
	}
	
	public String toBinaryString(int value) {
		//bit string 만들기
		String str = Integer.toBinaryString(value);
		System.out.println("str : " + str);//1010 
		//System.out.println("length : " + str.length());
		
		while(str.length() < 32) {
			str = "0" + str;
			//System.out.println(str.length());//4
		}
		
		return str;
	}
	
	public void toBinaryString2() {
		//bit string 만들기
		String text = "abcd";
		String[] textarr = {" "," "," ", " "};
		int one = 0;
		int i = 0;
		System.out.println(text.length());
		while(text.length()>i) {
			
			one = text.charAt(i);
			String str = Integer.toBinaryString(one);
			textarr[i] = str;
			
			while(str.length() < 32) {
				str = "0" + str;
				
			}
			
			System.out.println(str);
			//파일 저장-끊고-char로
			i++;
			
			
		}
	}
		public void toChar(String[] data) {
			
			int i =0;
			String s = "";
			
			while(data.length > i) {
				Integer tt = Integer.parseInt(data[i], 2);
				int itt = (int)tt;
				char ctt = (char)itt;
				s+=ctt;
				System.out.println(ctt);
				i++;
			}
			System.out.println(s);

			

	}
	
	

}
