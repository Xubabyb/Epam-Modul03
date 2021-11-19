
/*
 *  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

package by.jonline.modul03.object_string;

public class Exercise05 {

	public static void main(String[] args) {

		String str = new String("Подсчитать, сколько рАз среди символов заданной строки встречается буква “А”.");

		System.out.println("Количество  символов \'а\' = " + getCount(str, 'а'));

	}

	public static int getCount(String s, char ch) {

		int count = 0;

		String b = String.valueOf(ch);
		
		for (int i = 0; i < s.length(); i++) {
			
			String a = String.valueOf(s.charAt(i));
			
			if (a.equalsIgnoreCase(b)) {

				count++;
			}
		}

		return count;
	}
}
