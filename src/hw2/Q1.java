package hw2;

public class Q1 {
	
	public static void main(String[] args) {
	//• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	
		int sum = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}	
		System.out.println(sum);
		
	//• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		
		int sum1 = 1;
		for(int i = 1; i<= 10; i++) {
			sum1 *= i;
		}
		System.out.println(sum1);
	
	//• 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		
		int sum2 = 1;
		int i = 1;
		while(i <= 10) {
			sum2 *= i;
			i++;
		}
		System.out.println(sum2);
	
	}
	


}


