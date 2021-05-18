package p04.nested_interface;

//Nested Interface: 클래스 안에 Interface 
public class Button {

	
	 OnClickListener listener;
	 
	 public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	interface OnClickListener{
		void onClick();
	}
	
	void touch() {
		listener.onClick();
	}
	
}
