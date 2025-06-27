package hw1;

public class hm1_5 {
	public static void main(String[] args) {
		double money = 1500000; //本金
		double rate = 0.02; //利率
		int years = 10; //共10年
		
		double total = money;
		
		for(int i = 1; i <= years; i++ ) {
			total = total * (1 + rate);
		}	
			System.out.println("10年後本金加利息共有" + total);
		
	}

}
