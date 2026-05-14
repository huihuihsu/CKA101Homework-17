package hw5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height)，
//當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如圖：

public class Q1 {
	
	public void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("請輸入寬與高");
		Scanner s = new Scanner(System.in);
		int width = s.nextInt();
		int height = s.nextInt();
		
		Q1 w = new Q1();
		w.starSquare(width, height);
	}
	
}
