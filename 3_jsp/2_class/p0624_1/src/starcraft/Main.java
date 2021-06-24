package starcraft;

public class Main {

	public static void main(String[] args) {

		// 부대 지정 ... 5명을 부대 지정한다

		Unit[] arr = new Unit[5];

		arr[0] = new SCV();
		arr[1] = new SCV();
		arr[2] = new SCV();
		arr[3] = new Marine();
		arr[4] = new Marine();

		for (Unit unit : arr) {
			unit.move();
		}

		for (Unit unit : arr) {
			unit.attack();
		}

		for (Unit unit : arr) {
			if (unit instanceof Marine) {
				Marine marine = (Marine) unit;
				marine.useStreamPack();
			}
		}
	}
}

//=============================
//abstract class - 잘 사용 안함 
abstract class Unit {
	int hitPoint;// 체력
	int attackPoint;// 공격력
	int speed;// 이동속도

	abstract void attack();

	abstract void move();

	void stop() {
		System.out.println("[유닛 복잡한 멈춤 로직]유닛이 멈춥니다.");
	}

}

class SCV extends Unit {

	SCV() {
		this.attackPoint = 5;
		this.speed = 7;
		this.hitPoint = 40;
	}

	void attack() {
		System.out.println("[SCV 복잡한 공격 로직]" + attackPoint + "로 공격합니다.");
	}

	void move() {
		System.out.println("[SCV 복잡한 이동 로직]" + speed + "로 이동합니다.");
	}

}

class Marine extends Unit {

	Marine() {
		this.attackPoint = 10;
		this.speed = 15;
		this.hitPoint = 50;
	}

	void attack() {
		System.out.println("[Marine 복잡한 공격 로직]" + attackPoint + "로 공격합니다.");
	}

	void move() {
		System.out.println("[Marine 복잡한 이동 로직]" + speed + "로 이동합니다.");
	}

	void useStreamPack() {
		System.out.println("[Marine 특수기술] 스팀팩을 사용합니다.");
	}

}

class Tank extends Unit {

	void attack() {
		System.out.println("[Tank 복잡한 공격 로직]" + attackPoint + "로 공격합니다.");

	}

	void move() {
		System.out.println("[Tank 복잡한 이동 로직]" + speed + "로 이동합니다.");
	}

}
