package p03.object.clone;

public class Rectangle implements Cloneable{
	int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//재정의 
	@Override
	public Object clone(){
		
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
