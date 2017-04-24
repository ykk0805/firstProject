package ykk.object;

public class PointClass {
	
	private Double x;
	
	private Double y;
	
	private Double z;
	
	public PointClass(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double getZ() {
		return z;
	}

	public void setZ(Double z) {
		this.z = z;
	}
	
	
	public static void main(String[] args) {
		PointClass pc = new PointClass(1, 2, 3);
		System.out.println(pc);
	}
}
