package p03_for_while_dowhile;

public class WhileEx1 {

	public static void main(String[] args) {

		int sum=0;
		int i=0;
		//while: 조건에 따라 한번도 수행하지 않고 종료될 수 있다.
		while((sum += ++i) <= 100){ //sum = sum + (++i)
			System.out.printf("%d = %d%n", i, sum);
		}
		System.out.println("---------------------------");
		
		int i2=1;
		while(i2<=10) {
			System.out.println(i2);
			i2++;
		}

	}

}
