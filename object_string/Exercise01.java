
/*
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

package by.jonline.modul03.object_string;

public class Exercise01 {

	public static void main(String[] args) {

		String str = new String();

		str = "Дан текст (строка).   Найдите    наибольшее количество подряд   идущих пробелов в нем.";

		System.out.println(getCount(str, ' '));

	}

	public static int getCount(String s, char ch) {

		int temp = 0;

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ch) {

				temp++;
			} else {

				if (temp >= count) {

					count = temp;

					temp = 0;
				}
			}

		}

		return count;
	}

}
