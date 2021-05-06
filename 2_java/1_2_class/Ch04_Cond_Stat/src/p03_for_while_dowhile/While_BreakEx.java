package p03_for_while_dowhile;

public class While_BreakEx {

	public static void main(String[] args) {
		int sum = 0;
		int i=0;
		
		while(true) {
			if(sum>100)
				break;
			++i;
			sum+=1;
			
			
		}
		
		System.out.println(i);
		System.out.println(sum);
	}

}
