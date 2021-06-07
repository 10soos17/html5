package p05.secondary_stream;

import java.io.Serializable;

public class BBSItem implements Serializable {
	// Configuration Management(SCM): 형상관리 = 버전관리 = 구성관리
	private static final long serialVersionUID = 1L;

	static int itemNum = 0; // 직렬화 불가
	String writer;
	transient String passwd; // 직렬화 불가 - password이므로 객체 전송시 제외
	String title;
	String content;

	public BBSItem(String writer, String passwd, String title, String content) {
		this.writer = writer;
		this.passwd = passwd;
		this.title = title;
		this.content = content;
	}

}
