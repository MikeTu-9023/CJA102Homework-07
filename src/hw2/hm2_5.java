package hw2;

public class hm2_5 {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 1; i <= 49; i++) {
			int tens = i / 10;
			int units = i % 10;

			if (tens == 4 || units == 4) {

				continue;
			}
			System.out.print(i + " ");
			count++;
		}
		System.out.println("總共有：" + count + "個");
	}
}
