package advance.dev;

public class Circle extends Shape {
	
	double banKinh;
	
	

	public Circle(double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * banKinh;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return  Math.PI *banKinh * banKinh;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Hinh tron co ban kinh: %f", banKinh);
	}

}
