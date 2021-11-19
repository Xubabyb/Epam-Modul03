
/*
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

package by.jonline.modul03.object_string;

public class Exercise02 {

	public static void main(String[] args) {

		String str = new String();

		str = "in the line insert after each character 'a' character 'b'.";

		str = insertChar(str, 'a', 'b');

		System.out.println(str);
	}

	public static String insertChar(String s, char a, char b) {

		StringBuilder x = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			x.append(s.charAt(i));

			if (s.charAt(i) == a) {

				x.append(b);
			}

		}
		s = x.toString();

		return s;
	}
}
