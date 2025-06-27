package hw1;

public class hm1_2 {
	public static void main(String[] args) {
		int total = 200;
		int dozen = total / 12;  //計算一打
		int remainder = total % 12; //計算剩下的
		
		System.out.println("總共是:" + dozen + "打");
		System.out.println("餘下是:" + remainder);
	}
}
