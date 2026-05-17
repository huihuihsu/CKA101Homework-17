package hw5;

//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
//此驗證碼內容包含了英文大小寫與數字的亂數組合，如圖：

public class Q5 {
	
	public void getAuthCode() {
		String captcha = "";
		for(int i = 1; i <= 8; i++) {
			int condition = (int)(Math.random() * 3);
			switch(condition) {
			case 0:
				int result1 = (int)(Math.random() * 26) + 65;
				captcha += (char)result1;
				break;
			case 1:
				int result2 = (int)(Math.random() * 26) +97;
				captcha += (char)result2;
				break;
			case 2:
				int result3 = (int)(Math.random() * 10);
				captcha += result3;
				break;
			}
		}
		
		System.out.println(captcha);
	}
	
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		Q5 w = new Q5();
		w.getAuthCode();
	}

}
