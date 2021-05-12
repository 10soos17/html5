package p12_package;
//import: java.lang - 기본 패기키지이므로 생략, 그 나머지는 반드시 표시 
import java.util.Scanner;
import p11_final.Person;
//static import
import static java.lang.System.out;
import static java.lang.Math.random;


public class PackageEx {

	public static void main(String[] args) {
		System.out.println("홍길동");
		String str = new String();
		
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Math.random()); //old
		
		out.println(random()); //new
	}

}
