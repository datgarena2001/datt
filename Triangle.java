package advance.dev;

public class Triangle extends Shape {
	double a,b,c;
	

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	double chuVi() {
		// TODO Auto-generated method stub
		return a + b+ c;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi() / 2;		return Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Hinh tam giac co do dai ba canh la: %f, %f, %f", a,b,c);
	}
}
