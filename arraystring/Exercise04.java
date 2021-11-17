
/*
 *  В строке найти количество чисел.
 */

package by.jonline.modul03.arraystring;

public class Exercise04 {

	public static void main(String[] args) {

		String str = new String();

		str = "1 + 1 = 2 or 44 + 123 != 168 method works only with integers";

		System.out.println("Количество чисел в строке " + findNumber(str));

	}

	public static boolean checkDigit(char ch) {

		boolean flag = false;

		for (int i = 48; i < 58; i++) {

			if (ch == i) {

				flag = true;
			}
		}

		return flag;
	}

	public static int findNumber(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = 48; j < 58; j++) {

				if (s.charAt(i) == j && i == s.length() - 1
						|| s.charAt(i) == j && i != s.length() - 1 && !checkDigit(s.charAt(i + 1))) {

					count++;

				}
			}
		}

		return count;
	}
}
