package hw3;

import java.util.Scanner;

public class Q1 {
	
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形，如圖示結果：
	
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		int side1 = imput.nextInt();
		int side2 = imput.nextInt();
		int side3 = imput.nextInt();
		
		//廣義三角形
		boolean isTriangle = (side1 + side2 > side3) && (side1 + side3 > side3) && (side2 + side3 > side1);
		//正三角形
		boolean isEquilateralTriangle = (side1 == side2) && (side2 == side3);
		//等腰三角形
		boolean isIsoscelesTriangle = (side1 == side2) || (side1 == side3) || (side2 == side3);
		//直角三角形
		boolean isRightTriangle = (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) ||
								  (Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)) ||
								  (Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2));
		
		if(isTriangle) {
			if(isEquilateralTriangle) {
				System.out.println("這是正三角形");
			}
			else if(isIsoscelesTriangle) {
				System.out.println("這是等腰三角形");	
			}
			else if(isRightTriangle) {
				System.out.println("這是直角三角形");
			}
			else {
				System.out.println("這是一般三角形");
			}
		} else {
			System.out.println("這不是三角形");
		}
		

	}
	

}
