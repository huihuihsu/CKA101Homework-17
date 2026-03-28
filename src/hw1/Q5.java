//某人在銀行存入150萬,銀行利率為2%,
//如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢
//(用複利計算,公式請自行google)
//FV ＝ PV×（1 ＋ R）n 次方，
//FV 為未來終值，PV 為本金，r 為每期利率，n 為總期數

package hw1;

public class Q5 {
	
	public static void main(String[] args) {
		int pv = 1500000;
		double r = 0.02;
		
		System.out.println("本金和=" + pv * (1 + r) * (1 + r) * (1 + r) * (1 + r) * (1 + r) * (1 + r) * (1 + r) * (1 + r) * (1 + r) * (1 + r) + "元" );
	}

}
