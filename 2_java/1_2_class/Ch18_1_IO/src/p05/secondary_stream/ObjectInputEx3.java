package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//직렬화가 가능한 클래스 확인: "Serializable" 표시나 구현 여부에 의해서 직렬화가 가능
//						(예) GregorianCalendar
public class ObjectInputEx3 {

	public static void main(String[] args) {
		ObjectInputStream oi = null;

		try {
			FileInputStream fs = new FileInputStream("../../object2.dat");

			oi = new ObjectInputStream(fs);

			while (true) {
				BBSItem obj = (BBSItem) oi.readObject();
				System.out.println("전체 게시물의 수: " + obj.itemNum);
				System.out.println("글쓴이: " + obj.writer);
				System.out.println("PW: " + obj.passwd);
				System.out.println("제목: " + obj.title);
				System.out.println("내용: " + obj.content);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수가 없습니다.");
		} catch (EOFException e) {
			System.out.println("끝.");
		} catch (IOException e) {// EOFException의 부모
			System.out.println("파일로 출력할 수 없습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("예외");
		}
		try {
			oi.close();
		} catch (IOException e) {

		}
	}

}
