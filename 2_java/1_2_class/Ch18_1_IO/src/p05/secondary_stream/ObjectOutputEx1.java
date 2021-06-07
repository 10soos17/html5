package p05.secondary_stream;

//직렬화(Serializable) 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputEx1 {

	public static void main(String[] args) {
		ObjectOutputStream ot = null;
		try {
			FileOutputStream fs = new FileOutputStream("objectOutput.dat");

			ot = new ObjectOutputStream(fs);
			ot.writeObject(new GregorianCalendar(2021, 6, 7));
			ot.writeObject(new GregorianCalendar(2021, 6, 8));
			ot.writeObject(new GregorianCalendar(2021, 6, 9));

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수가 없습니다.");
		} catch (IOException e) {
			System.out.println("파일로 출력할 수 없습니다.");
		}

	}

}
