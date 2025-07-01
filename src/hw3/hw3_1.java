package hw3;

import java.util.Scanner;

public class hw3_1 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入:");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a > 0 && b > 0 && c > 0 && (a+b>c )&&(a+c>b)&&(b+c>a)) {
			if (a == b && b==c && a==c) {
				System.out.println("正三角形");
			}
			else if (a==b || b==c || a==c) {
				System.out.println("等腰三角形");
			}
			else {
				System.out.println("其他三角形");
			}
		}
		else {
			System.out.println("不是三角形");
		}
	}
}
