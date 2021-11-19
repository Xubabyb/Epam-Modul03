
/*
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

package by.jonline.modul03.object_string;

public class Exercise06 {

	public static void main(String[] args) {
		
		String str = new String();
		
		str = "Из заданной строки получить новую, повторив каждый символ дважды.";
		
		str = repeatChar(str);
		
		System.out.println(str);
	}

	public static String repeatChar(String s) {

		StringBuilder x = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {

			x.append(s.charAt(i)).append(s.charAt(i));

		}
		s = x.toString();

		return s;
	}
}
