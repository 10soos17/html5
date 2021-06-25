package list;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		//1. ArrayList
		ArrayList<String> list = new ArrayList<String>();

		list.add("한조0");
		list.add("한조1");
		list.add("한조2");
		list.add("한조3");

		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println(name);
		}
		
		for(String name : list) {
			System.out.println(name);
		}
		
		/////////////////////////잡다...!!!///////////////////////////
		//ArrayList일 경우, 아래 삽입은 고려해야 될 사항들이 많다
		list.add(2, "안녕하세요"); //2번째에 삽입
		//ArrayList일 경우, 아래 삽입은 고려해야 될 사항들이 많다
		list.remove(2);//2번째 삭제 
		list.remove("한조2");//삭제는 삭제인데, 탐색 후 삭제 
		
		//존재 하냐? //탐색 - 제일 중요한 로직이 탐색일 경우, list 계열은 모두 다 느림  
		if(list.contains("한조3")) {
			//...
		} 
			
		
		
	}

}

class Node<E> {

	E value;
	Node next;

}