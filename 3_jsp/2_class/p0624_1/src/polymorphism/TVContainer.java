package polymorphism;

import java.util.HashMap;

public class TVContainer {

	private HashMap<String, TV> map = new HashMap<>();

	public TVContainer() {
		map.put("삼성", new SamsungTV());
		map.put("엘지", new LgTV());
		map.put("SK", new SkTV());
		map.put("MY", new MyTV());
	}

	public TV getTV(String tvName) {
		TV tv = map.get(tvName);
		return tv;
	}
}
