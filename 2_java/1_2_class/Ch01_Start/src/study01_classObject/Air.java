package study01_classObject;

class Air{
	String name;
	
	//Constructor Overloading: 생성자가 여러개이며, 파라미터의 갯수, 순서, 타입이 각각 다른 ) 
	public Air() {
		
	}
	//파라미터가 있는 생성
	public Air(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	//setter(): 데이터 저장 
	public void setName(String name) {
		this.name = name;
	}

}
