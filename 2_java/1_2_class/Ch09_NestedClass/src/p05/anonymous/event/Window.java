package p05.anonymous.event;

public class Window {
	
	Button button1 = new Button();
	Button button2 = new Button();	

	//중첩 익명구현객체 
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	public Window() {
		button1.setListener(listener);
		
		button2.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("전화를 겁니다.");
				
			}
		});
	}
}
