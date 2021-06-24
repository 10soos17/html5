package collection;
import java.util.*;
//자료구조 
public class Main {
	
	public static void main(String[] args) {
		//1.배열 
		//크기가 고정, 그 크기만큼의 데이터가 있을 때만 씀
		//삽입, 삭제, 추가 빈번하게 발생할 경우, 절대 배열 사용하지 말 것 
		//장: 접근속도는 가장 빠름 
		int[] scores = new int[5];

		scores[0] = 70;
		scores[1] = 77;
		scores[2] = 12;
		scores[3] = 66;
		scores[4] = 55;
		//scores[5] = 51;//stack overflow
		
		int[] tempScores = new int[scores.length * 2];
		//scores값 복사 후...
		scores = tempScores;
		
		//2.ArrayList
		//크기 가변 
		//위 복사과정을 통해 데이터 추가함 (배열의 단점이 그대로) 
		//참조타입만 지정가능 
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(70);
		arrayList.add(70);
		arrayList.add(70);
		arrayList.add(70);
		arrayList.add(70);
		
		//3.List
		//Interface
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		List<Integer> list3 = new Vector<Integer>();
	}
	

}
