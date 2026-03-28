//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因

package hw1;

public class Q6 {
	
	public static void main(String[] args) {
		
		System.out.println(5 + 5); // 數值5與數值5「相加」故等於10
		System.out.println(5 + '5'); //數值5與「字元5->對應編碼為53」相加 故等於5+53=58
		System.out.println(5 + "5"); //數值5與「字串5」串接 故等於「55」
	}

}
