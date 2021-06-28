package collection;

import java.util.*;
//자료구조 : 배열의 단점을 극복하고자 만든 알고리즘 ex.Java에서는 Collection에 만들어져있다 
//List 계열 : 순서o 
//	-배열 - ArrayList : 장 - 접근속도, 중간삽입, 중간삭제 / 단 - 탐색(존재여부)
//		-LinkedList : 장 - / 단 - 접근속도(중간삽입,중간삭제), 탐색(존재여부)
//		-Queue : FIFO, linkedlist로 만들어서 쓰는 게 유용,offer와 poll 메소드만 사용하는 것이 queue 구조에 맞는 사용 장 - / 단 - 
//		-Stack : FILO, 
//Set 계열 : 순서x,값의 중복을 허용하지 않음 / 장 -탐색(존재 여부),정렬,if (set.contains(3)) {...}에 효율 / 단 -용도가 많이 한정적
//			사실상 값 넣을때 정렬되어있는 것,쓸 일이 많지 않음
// 

//Map 계열 : 가장 좋다! 순서x  키, 값의 쌍, 키의 중복은 불가(새값으로수정됨) / 장 - 대부분 장점, 키로 값 접근은 최상, 접근, 삽입, 삭제 / 단 - 탐색(탐색용도로 잘 안씀)
//			키는 항상 String으로 


//*hash(해쉬, 해싱) -> 암호화 함수, 일방향(복호화가 안되어야 된다)/충돌문제 
public class Main {

	public static void main(String[] args) {
		// 1.배열
		// 크기가 고정, 그 크기만큼의 데이터가 있을 때만 씀
		// 삽입, 삭제, 추가 빈번하게 발생할 경우, 절대 배열 사용하지 말 것
		// 장: 접근속도는 가장 빠름
		int[] scores = new int[5];

		scores[0] = 70;
		scores[1] = 77;
		scores[2] = 12;
		scores[3] = 66;
		scores[4] = 55;
		// scores[5] = 51;//stack overflow

		int[] tempScores = new int[scores.length * 2];
		// scores값 복사 후...
		scores = tempScores;

		// 2.ArrayList
		// 크기 가변
		// 위 복사과정을 통해 데이터 추가함 (배열의 단점이 그대로)
		// 참조타입만 지정가능
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(70);
		arrayList.add(70);
		arrayList.add(70);
		arrayList.add(70);
		arrayList.add(70);

		// 3.List
		// Interface
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		List<Integer> list3 = new Vector<Integer>();
	}

}
