package hw4;

import java.util.Scanner;

//• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5個,
//其員工編號與身上現金列表如下：

//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//員工編號: 25 19 27 共3 人!」
//(提示：Scanner，二維陣列)

public class Q4 {

	public static void main(String[] args) {
		int[][] coworkers = { 
							{ 25, 32, 8, 19, 27 }, 
							{ 2500, 800, 500, 1000, 1200 } 
							};
		int friends = 0;
		int amount = 0;
		System.out.println("請輸入預借的金額：");

		Scanner s = new Scanner(System.in);
		amount = s.nextInt();
		
		for (int i = 0; i < coworkers[1].length; i++) {
			if (coworkers[1][i] >= amount) {
				System.out.print(coworkers[0][i] + " ");
				friends++;
			}
		}
		
		System.out.println("可借人數：" + friends + "人");

	}

}
