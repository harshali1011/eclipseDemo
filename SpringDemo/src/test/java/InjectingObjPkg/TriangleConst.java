package InjectingObjPkg;

public class TriangleConst {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
		public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

		public void draw() {
		System.out.println("pintA : " +getPointA().getX()+ " ," +getPointA().getY());
		System.out.println("pintB : " +getPointB().getX()+ " ," +getPointB().getY());
		System.out.println("pintC : " +getPointC().getX()+ " ," +getPointC().getY());
	}

}
