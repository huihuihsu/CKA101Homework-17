package hw3;

import java.util.Scanner;

public class Q2 {
	
//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，
//猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
	
	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 10) + 0;
		System.out.println("開始猜數字吧!（範圍：0~9）");
		
		Scanner number = new Scanner(System.in);
		int guess = number.nextInt();
		
		while(guess != answer) {
			System.out.println("猜錯囉！再試試看吧！");
			guess = number.nextInt();
		}
		
		System.out.println("恭喜你猜對囉！答案就是：" + answer);
	
	number.close();
		
	}
	
	
}
