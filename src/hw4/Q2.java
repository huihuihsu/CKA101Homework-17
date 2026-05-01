package hw4;

//• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH
//(提示：String方法，陣列)

public class Q2 {
	
	public static void main(String[] args) {
		String s = "Hello World";
		char[] charArray = new char[s.length()];
		
		for(int i = 0; i < charArray.length; i++) {
			charArray[i] = s.charAt(i);
		}
		
		for(int n = charArray.length - 1; n >= 0; n-- ) {
			System.out.print(charArray[n]);
		}
		
		System.out.println();
				
	}

}
