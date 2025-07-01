package hw3;

import java.util.Scanner;

public class hw3_2 {
	public static void main(String []args) {
		int answer = (int)(Math.random()*10);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("遊戲開始！");
		
		while(true) {
			int guess = scanner.nextInt();
			if (guess == answer) {
				System.out.println("恭喜答對！");
				break;
			}
			else {
				System.out.println("猜錯囉！");
			}
		}
	}
}
