
/*
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить
 *  на одиночные пробелы.Крайние пробелы в строке удалить.
 */

package by.jonline.modul03.arraystring;

public class Exercise05 {

	public static void main (String [] args) {

		String str = new String();
		
		str = " Удалить   в        строке    все    лишние    пробелы ";
		
		str = deleteRepeatChar(str,' ');
		
		System.out.println(str);
	}

	public static String deleteRepeatChar(String s, char ch) {
		
		//Субъективно кажется что StringBuilder будет по быстрее

		char[] massCh = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {

			if (massCh[i] == ch && i != s.length() - 1 && massCh[i + 1] == ch) {

				for (int j = i; j > 0; j--) {
				
					massCh[j] = massCh[j - 1];

				}
			}
		}
		s = String.copyValueOf(massCh);
		
		return s.trim();
	}
}
