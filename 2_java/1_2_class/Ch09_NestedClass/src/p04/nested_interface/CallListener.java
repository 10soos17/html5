package p04.nested_interface;

//import p04.nested_interface.Button.OnClickListener;


public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
		
	}

}
