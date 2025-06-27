package hw1;

public class hm1_4 {
	public static void main(String[] args) {
		double pi = 3.1415;
		double r = 5;
		double area = pi * r * r; //算面積
		double circumference = (r + r) * pi;  //算周長
		
		System.out.println("面積是:" + area);
		System.out.println("圓周長是:" + circumference);
	}
}
