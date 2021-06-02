package Exercise;

import java.util.HashMap;
import java.util.Map;

public class MapExample9 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		for (String s : map.keySet()) {
			if (map.get(s) > maxScore) {
				maxScore = map.get(s);
				name = s;
			}
			totalScore += map.get(s);
		}
		System.out.println("최고점수를 받은 아이디: "+name+"\n최고점수: "+maxScore + "\n평균: " + totalScore/map.size());

	}

}
