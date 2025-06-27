package hw1;

public class hm1_3 {
	public static void main(String[] args) {
		int total = 256559;
		int days = total / (24 * 3600);  //一天24小時＊3600秒
		int hours = (total %(24 * 3600)) / 3600; //剩下的秒換小時
		int minutes = (total % 3600) / 60;  //一分鐘60秒
		int second = total % 60; //計算剩下的

		
		System.out.println(days + "天" + hours + "小時" + minutes + "分鐘" + second + "秒");
	}
}
