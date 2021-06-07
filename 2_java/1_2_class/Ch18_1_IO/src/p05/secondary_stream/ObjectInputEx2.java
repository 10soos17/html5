package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//직렬화가 가능한 클래스 확인: "Serializable" 표시나 구현 여부에 의해서 직렬화가 가능
//						(예) GregorianCalendar
public class ObjectInputEx2 {

	public static void main(String[] args) {
		ObjectInputStream oi = null;

		try {
			FileInputStream fs = new FileInputStream("../../object.dat");

			oi = new ObjectInputStream(fs);

			while (true) {
				GoodStock gc = (GoodStock) oi.readObject();
				System.out.println("상품코드: " + gc.code + ", 상품수량: " + gc.num);
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
