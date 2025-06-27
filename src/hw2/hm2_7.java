package hw2;

public class hm2_7 {
	public static void main(String [] args) {
		for(int i = 0; i < 6; i++) {
			char letter = (char)('A' + i);
			for(int j = 0; j <= i; j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
	}
}


