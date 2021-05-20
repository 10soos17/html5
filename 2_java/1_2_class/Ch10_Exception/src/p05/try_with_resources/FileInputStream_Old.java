package p05.try_with_resources;

public class FileInputStream_Old {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
			fis.read();
			throw new Exception();// 강제적으로 예외 발생
		} catch (Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");
		}finally {
			try {
				fis.close();
			} catch (Exception e) {
				
			}
		}
	}

}
