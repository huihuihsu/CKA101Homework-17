package hw3;

import java.util.Scanner;

public class Q2_advance {
//進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案

	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 101) + 0;
		System.out.println("開始猜數字吧!（範圍：0~100）");
		
		Scanner number = new Scanner(System.in);
		int guess = number.nextInt();
		
		while(guess != answer) {
		if(guess > answer) {
			System.out.println("你猜錯囉！答案是比較小的數字！");
		} else {
			System.out.println("你猜錯囉！答案是比較大的數字！");
		}
		System.out.println("再猜一次吧：");
		guess = number.nextInt();

	}
		
		System.out.println("恭喜你答對了！答案就是：" + answer);

		
		number.close();
	}
	
}
