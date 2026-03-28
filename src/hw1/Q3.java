//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

package hw1;

public class Q3 {
	
	public static void main(String[] args) {
	int time = 256559;
	int daysecond = 60*60*24; //一天有幾秒
	int hoursecond = 60*60; //一小時有幾秒
	int minutesecond = 60; //一分鐘有幾秒
	
	System.out.printf("2556559秒為" + ( time / daysecond ) + "天" );
	System.out.printf((time % daysecond) / hoursecond + "小時");
	System.out.printf((time % daysecond % hoursecond) / minutesecond + "分");
	System.out.printf(time % daysecond % hoursecond % minutesecond + "秒" );
	
	}
	

}
