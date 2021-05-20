package p05.try_with_resources;

public class FileInputStream implements AutoCloseable {

	private String file;

	public FileInputStream(String file) {
		super();
		this.file = file;
	}

	// 추상 메소드
	@Override
	public void close() throws Exception {

		System.out.println(file + "을 닫습니다.");
	}

	public void read() throws Exception {
		System.out.println(file + "을 읽습니다.");
	}
}
