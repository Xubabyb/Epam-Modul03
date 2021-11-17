
/*
 *  В строке найти количество цифр.
 */

package by.jonline.modul03.arraystring;

public class Exercise03 {

	public static void main(String[] args) {

		String str = new String();

		str = "1 + 1 = 2 or 11 + 1 = 13";

		System.out.println("Количество цифр в строке " + findDigit(str));

	}

	public static int findDigit(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = 48; j < 58; j++) {

				if (s.charAt(i) == j) {

					count++;

				}
			}
		}

		return count;

	}

}
