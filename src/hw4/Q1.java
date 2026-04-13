package hw4;

//• 有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示：陣列，length屬性)

public class Q1 {
	
	public static void main(String[] args) {
		int sum = 0;
		int average = 0;
		int[]thearray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		for(int i = 0; i < thearray.length; i++) {
			sum += thearray[i];
		}
		
		average = sum / thearray.length;
		
		System.out.println("平均值是：" + average);
		
		for(int a = 0; a < thearray.length; a++) {
			if(thearray[a] > average) {
				System.out.print(thearray[a] + " ");
			}
		}
	}

}
