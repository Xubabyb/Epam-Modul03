
/*
 *  Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 *   Например, если было введено "abc cdedef", то должно быть выведено "abcdef"
 */

package by.jonline.modul03.object_string;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		String s = new String();

		s = enterString();

		s = formatString(s);

		System.out.println(s);

	}

	public static String formatString(String s) {

		String newS = "";

		for (int i = 0; i < s.length(); i++) {

			if (!newS.contains(s.charAt(i) + "") && s.charAt(i) != ' ') {

				newS = newS + s.charAt(i);
			}
		}

		s = newS;

		return s.trim();
	}

	public static String enterString() {

		String str = new String();

		@SuppressWarnings("resource")

		Scanner scan = new Scanner(System.in);

		System.out.println("Ввведите строку требующую редактирования >>");

		str = scan.nextLine();

		return str;
	}

}
