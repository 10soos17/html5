package p05.secondary_stream;

import java.io.Serializable;

// 우리가 만든 객체 직렬화: "implements Serializable" 사용
public class GoodStock implements Serializable {

	// private static final long serialVersionUID = 1L;
	String code;
	int num;

	public GoodStock(String code, int num) {
		this.code = code;
		this.num = num;
	}

}
