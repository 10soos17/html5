package singleton;
import java.util.Calendar;


public class Main {

	public static void main(String[] args) {
		SomeController sc = SomeController.getInstance();
		
		sc.printSum();
		
		SomeController sc2 = SomeController.getInstance();
		
		sc2.printSum();
		
		Calendar xxx = Calendar.getInstance();
		
		System a;
		
//		p1.CommonData cd = new p1.CommonData();
//		p1.CommonData.count++;
//		p1.CommonData.printHelp();
//		cd.test();
	}

}
