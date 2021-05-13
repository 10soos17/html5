package p02.inherit;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	public DmbCellPhone(int channel) {
		this.channel = channel;
	}

	//생성자
	DmbCellPhone(String model, String color, int channel){
		//this.model = model;
		//this.color = color;
		
		//생성자 호출은 반드시 생성자 안에서 첫번째 줄에 위치해야 된다.
		super(model, color);//부모 생성자 호출 
		//this(channel);
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널" +channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("채널" +channel+"번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	@Override
	void hangUp() {
		System.out.println("전화 끊기");
		super.hangUp();
	}
}
