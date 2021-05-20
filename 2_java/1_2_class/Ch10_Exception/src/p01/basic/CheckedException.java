package p01.basic;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
//Checked Exception: 컴파일 에러발생, 반드시 예외처리 해야함.
import java.io.FileReader;
import java.io.IOException;
//Checked Exception: 반드시 예외 처리 
public class CheckedException {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("text.txt");//컴파일 에러 발생 try~catch
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			do {
				str = br.readLine();//컴파일 에러 발생 try~catch
				System.out.println(str);
			
			}while(!(str == null));
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. 위치 확인");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		System.out.println("Done");
	}

}
