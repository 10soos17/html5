package singleton;

public class SomeController {
	
	private static final SomeController instance = new SomeController();
	
	public static SomeController getInstance() {
		return instance;
	}
	
	//�̱��� �ڵ� - �� �Ѱ��� �ν��Ͻ��� ����Ѵ�.
	private SomeController(){
		//...�ʿ信 ���� �ʱ�ȭ �ڵ带 �ۼ� 
	}
	
	///////////////�����/////////////////////////
	//�Ӽ�
	private int value1;
	private int value2;
	
	//���
	public void printSum() {
		System.out.println(this.value1 + this.value2);
	}
	
	
}
