package p05.secondary_stream;

//1037: Primitive Type I/O 보조 스트림 - DataInputStream, DataOutputStream
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//보조 스트림 
//DataOutputSream: primitive type => Byte Stream 저장시 사용 
public class DataOutputEx1 {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		DataOutputStream ds = null;
		try {
			fo = new FileOutputStream("../../DataOuput.dat"); // 주 스트림
			ds = new DataOutputStream(fo); // 보조 스트림

			int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

			for (int i = 0; i < arr.length; i++) {
				try {
					ds.writeInt(arr[i]);
				} catch (IOException e) {
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("저장 또는 출력에 문제 있습니다.");
		} finally {
			try {
				ds.flush();
				ds.close();
				fo.close();
			} catch (IOException e) {
			}

		}
	}

}
