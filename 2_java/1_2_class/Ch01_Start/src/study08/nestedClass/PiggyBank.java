package study08.nestedClass;

public class PiggyBank {

	int total;
	Slot slot;
	//생성자 
	PiggyBank(){
		total = 0;
		slot = new Slot();
		System.out.println(this.slot);
		
		
	}
	//Instance Inner Class
	class Slot{//입구 클래스

		void put(int amount) {
			total += amount; //Outter Class를 직접 사용 
			System.out.println(this+"저금통"+total);
		}
		
	}
}
