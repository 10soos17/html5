package p06.array;

public class ArrayCopyForEx1 {

	public static void main(String[] args) {

		int[] oldIntArray = { 1, 2, 3 }; // 12byte
		int[] newIntArray = new int[5]; // 20byte

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			//System.out.println("newIntArray[" + i + "] = " + newIntArray[i]);
			System.out.print(newIntArray[i] + "");
		}
		System.out.println("\n-------------------------------");
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] result = new char[abc.length];
		
		//p.168
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//arraycopy(원래배열, 원래배열시작인덱스, 만들배열, 만들배열시작인덱스, 복사할갯수)
		System.arraycopy(abc,0,result,0,abc.length);
		System.out.println(result);

		
	}

}
