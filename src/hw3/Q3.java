package hw3;

import java.util.Scanner;

public class Q3 {
	
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，
//但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，
//讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇的號碼與總數
	
	public static void main(String[] args) {
		
		System.out.println("阿文，你討厭哪個數字？（1~9）");
		Scanner n = new Scanner(System.in);
		int hate = n.nextInt();
		int count = 0;  
		for(int i = 1; i <= 49; i++) {
			if(i / 10 != hate && i % 10 != hate) {
				System.out.print(i + "\t");
				count++;
			if(count % 5 == 0) {
				System.out.println();
				}
			}
		}
		
		System.out.println("阿文，你總共有" + count + "個號碼可以選");
		
		n.close();
	}
	
	
}