package hw5;

//請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中
//取平均值並印出這10個亂數與平均值，如圖：

public class Q2 {
	
	public void randAvg() {
		int sum = 0;
		System.out.println("本次取得的10個亂數為：");
		for(int i = 0; i < 10; i++) {
			int ran = (int)(Math.random()*101);
			System.out.print(ran + " ");
			sum += ran;
		}
		System.out.println();
		System.out.println("平均值為：" + (sum / 10));
		
	}
	
	public static void main(String[] args) {
		Q2 w = new Q2();
		w.randAvg();
	}
	

}
