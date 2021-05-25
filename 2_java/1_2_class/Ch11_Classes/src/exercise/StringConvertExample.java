package exercise;

public class StringConvertExample {

	public static void main(String[] args) {
		String strData1 = new String("200");
		String strData2 = "200";
		int intData2 = 150;
		
		int intData1;
		String strData3;
		try {
			intData1 = Integer.parseInt(strData1);
			strData3 = String.valueOf(intData2);
			System.out.println(intData1 + "\n"+strData3);
		} catch (NumberFormatException e) {

			
		}
		

	}

}
