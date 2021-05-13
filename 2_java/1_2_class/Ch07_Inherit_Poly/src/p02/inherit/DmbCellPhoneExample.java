package p02.inherit;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dcp = new DmbCellPhone("자바폰", "검정", 10);
		
		DmbCellPhone dcp2= new DmbCellPhone(10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델: " + dcp.model);
		System.out.println("색상: " + dcp.color);

		//DmbCellPhone의 필드
		System.out.println("채널: " + dcp.channel);
	
		//CellPhone으로부터 상속받은 메소드 호출
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요");
		dcp.receiveVoice("안녕하세요! 저는...");
		dcp.sendVoice("아~ 예 반갑습니다.");
		dcp.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
	}

}
