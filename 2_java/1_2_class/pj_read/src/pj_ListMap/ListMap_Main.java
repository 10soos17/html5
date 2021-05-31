package pj_ListMap;

import java.util.Arrays;
import java.util.List;

//List계열: 자료가 순차적이고, 중복적인 자료가 있을 때 사용 
//		   ArrayList, Vector, LinkedList,,,
//		   Vector: Synchronized 메소드 적용, 속도가 늦음, 초기에 나옴
//		   ArrayList: 비동기화 메소드 적용, 속도가 빠름, 배열의 단점을 극복(배열 크기 가변), 수정삭제에 유리 

public class ListMap_Main {

	public static void main(String[] args) {

		UserList<List> am3 = new UserList<List>();
		am3.customAdd("베타고", 20);
		//System.out.println("id: "+am3.getId());
		am3.getMap();

		am3.customAdd("알파고", 30);
		//System.out.println("id: "+am3.getId());
		am3.getMap();

		am3.search(Arrays.asList("알파고", 30));

	}
}