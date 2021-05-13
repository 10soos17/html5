package exercise;

public class ShopService {
	//최초 한번 싱글톤객체 생성
	private static ShopService ss = new ShopService();
	
	//보안: 다른 클래스에서 객체 생성 불능 
	private ShopService() {
		
	}
	//외부에서 싱글톤객체 호출 
	static ShopService getIncetance(){
		return ss;
	}

	
	
}
