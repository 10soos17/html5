package p07.synchronizeds;

//771
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//List 계열
//		Vector: 동기화 메소드 사용, 속도 느림
//		ArrayLsit: 비동기화 메소드 사용, 속도 빠름 => Collections, synchronizeList()를 사용한 동기화 구현 
public class SynchronizedEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		List<String> syn = Collections.synchronizedList(list);
		syn.add("hong");
		syn.add("AlphoGO");
		syn.add("Park");

		// 동기화 블럭
		synchronized (syn) {
			// iterator() 출력하기
			Iterator<String> it = syn.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}

}
