package hw3;

import java.util.Scanner;

public class Q3_advance {
	
//進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
	
public static void main(String[] args) {
		
		int[] luckyNumbers = new int[50];
		for(int i = 0; i < luckyNumbers.length; i++) {
			luckyNumbers[i] = i;
		}
		
		System.out.println("阿文，你討厭哪個數字？（1~9）");
		Scanner n = new Scanner(System.in);
		int hate = n.nextInt();
		
		for(int i = 1; i <= 6; i++) {
			int random = (int)(Math.random() * 49) +1;
			if(random / 10 == hate || random % 10 == hate) {
				i--;
				continue;
				}
			if(luckyNumbers[random] == 0) {
				i--;
				continue;
			}
			System.out.print(random + " ");
			luckyNumbers[random] = 0;
		
			}
		n.close();
		}
				
}
