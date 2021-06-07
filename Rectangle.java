package advance.dev;

public class Rectangle extends Shape {
	public Rectangle(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	double chieuDai,chieuRong;

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 2 * chieuDai * chieuRong * 2;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return chieuDai * chieuRong ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Hinh chu nhat co chieu dai chieu rong lan luot: %f, %f", chieuDai,chieuRong);
	}

}
