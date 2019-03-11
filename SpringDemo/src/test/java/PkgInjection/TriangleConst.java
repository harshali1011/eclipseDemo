package PkgInjection;

public class TriangleConst {
	private String type;
	private int height;

	public String getType() {
		return type;
	}
	public int getHeight() {
		return height;
	}
	public TriangleConst(int height)
	{
		System.out.println("Called constructor with int data type");
		this.height=height;
		
	}
	public TriangleConst(String type)
	{
		System.out.println("Called constructor with String data type");
		this.type=type;
				
	}
	public TriangleConst(int height,String type)
	{
		System.out.println("Called constructor with int and String data type");
		this.height=height;
		this.type=type;
				
	}
	/*public void setType(String type) {
		this.type = type;
	}*/
	public void draw() {
		System.out.println(getType()+" triangle drawn of height : "+ height);
	}

}
