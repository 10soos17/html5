package p04.nested_interface;

//import p04.nested_interface.Button.OnClickListener;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
