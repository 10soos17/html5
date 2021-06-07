package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

//직렬화가 가능한 클래스 확인: "Serializable" 표시나 구현 여부에 의해서 직렬화가 가능
//						(예) GregorianCalendar
public class ObjectInputEx1 {

	public static void main(String[] args) {
		ObjectInputStream oi = null;
		try {
			FileInputStream fs = new FileInputStream("../../objectOutput.dat");

			oi = new ObjectInputStream(fs);

			while (true) {
				GregorianCalendar gc = (GregorianCalendar) oi.readObject();
				int year = gc.get(Calendar.YEAR);
				int month = gc.get(Calendar.MONTH);
				int date = gc.get(Calendar.DATE);
				System.out.println(year + "/" + month + "/" + date);
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
			System.out.println("예외.");
		}
		try {
			oi.close();
		} catch (IOException e) {
		}
	}

}
