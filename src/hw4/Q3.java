package hw4;

//• 有個字串陣列如下(八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)

public class Q3 {

	public static void main(String[] args) {

		int aeiou = 0;
		String[] sArray = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		for (int i = 0; i < sArray.length; i++) {
			for (int n = 0; n < sArray[i].length(); n++) {
				switch (sArray[i].charAt(n)) {
				case 'a':
					aeiou++;
					break;
				case 'e':
					aeiou++;
					break;
				case 'i':
					aeiou++;
					break;
				case 'o':
					aeiou++;
					break;
				case 'u':
					aeiou++;
					break;

				}

			}
		}

		System.out.println("母音總共有：" + aeiou + "個");

		int aeiou2 = 0;
		for (int i = 0; i < sArray.length; i++) {
			for (int n = 0;  n < sArray[i].length(); n++) {
				switch (sArray[i].charAt(n)) {
				case 'a', 'e', 'i', 'o', 'u':
					aeiou2++;
				}
			}
		}
		System.out.println("母音總共有：" + aeiou2 + "個");
	}

}

