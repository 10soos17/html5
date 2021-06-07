package p05.secondary_stream;

//직렬화(Serializable) 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputEx2 {

	public static void main(String[] args) {
		ObjectOutputStream ot = null;
		try {
			FileOutputStream fs = new FileOutputStream("../../object.dat");

			ot = new ObjectOutputStream(fs);
			ot.writeObject(new GoodStock("영", 0));
			ot.writeObject(new GoodStock("일", 1));
			ot.writeObject(new GoodStock("이", 2));

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수가 없습니다.");
		} catch (IOException e) {
			System.out.println("파일로 출력할 수 없습니다.");
		}

	}

}
