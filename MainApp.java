package advance.dev;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MainApp {
	public static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3 ; i++) {
			System.out.println("Nhap ban kinh hinh tron: ");
			double banKinh = sc.nextDouble();
			Shape cir = new Circle(banKinh);
			shapes[i] = cir;
		}
		for (int i = 3; i < 6 ; i++) {
			System.out.println("Nhap chieu dai, chieu rong hinh chu nhat");
			double chieuDai = sc.nextDouble();
			double chieuRong =sc.nextDouble();
			Shape rect = new Rectangle(chieuDai, chieuRong);
			shapes[i] = rect;
		}
		for (int i = 6; i < 10; i++) {
			System.out.println("Nhap do dai ba canh cua tam giac: ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			Shape tg = new Triangle(x, y, z);
			shapes[i] = tg;
		}
		
	}
	public static void print(Shape[] shapes) {
//		System.out.println(Arrays.toString(shapes));
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}
	}
	public static void findDienTich(Shape[] shapes) {
		Shape preMax = shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if (preMax.dienTich() < shapes[i].dienTich()) {
				preMax = shapes[i];
			}
		}
		System.out.println("Hinh co DT lon nhat la:" + preMax.toString());
		System.out.println("DIen tich lon nhat la: "+preMax.dienTich());
	}
	public static void findMoiLoai(Shape[] shapes) {
		Shape prehinhTron = shapes[0];
		Shape preHCN = shapes[0];
		Shape preHTG = shapes[0];
		for (int i = 0; i < 3; i++) {
			if (prehinhTron.dienTich() < shapes[i].dienTich()) {
				prehinhTron = shapes[i];
			}
		}
		System.out.println("Gia tri hinh tron lon nhat la: " + prehinhTron.dienTich());
		for (int i = 3; i < 6 ; i++) {
			if (preHCN.dienTich() < shapes[i].dienTich() ) {
				preHCN = shapes[i];
			}
			
		}
		System.out.println("gia tri hinh chu nhat lon nhat la: " + preHCN.dienTich() );
		for (int i = 6; i < 10; i++) {
			if (preHTG.dienTich() < shapes[i].dienTich() ){
				preHTG = shapes[i];
				
			}
			
		}
		System.out.println("dien tich hinh tam giac lon nhat la: " + preHTG.dienTich() );
	}
	

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[10];
		input(shapes);
		print(shapes);
		findDienTich(shapes);
		findMoiLoai(shapes);
		
	}

}

