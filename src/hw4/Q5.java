package hw4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」

//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

public class Q5 {

	public static void main(String[] args) {
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31 };
		int year, month, day, howManyDays = 0;

		System.out.println("請輸入年(西元)/月/日：");
		Scanner s = new Scanner(System.in);
		year = s.nextInt();
		month = s.nextInt();
		day = s.nextInt();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		if (month < 1 || month > 12) {
			System.out.println("請重新輸入正確月份！");
			month = s.nextInt();
		}

		if (day > days[month]) {
			System.out.println("請重新輸入正確日期！");
			day = s.nextInt();
		}

		if (isLeapYear) {
			days[2] = 29;
			while (day < 1 || day > 29) {
				System.out.println("請輸入2月的正確日期");
				day = s.nextInt();
			}
		}

		if (!isLeapYear && month == 2) {
			while (day < 1 || day > 28) {
				System.out.println("請輸入2月的正確日期");
				day = s.nextInt();
			}
		}

		for (int i = 0; i < month; i++) {
			howManyDays += days[i];
		}

		howManyDays += day;

		System.out.println("輸入為" + year + "年" + month + "月" + day + "日，為該年的第" + howManyDays + "天");

	}

}
