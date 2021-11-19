
/*
 *  С помощью функции копирования и операции конкатенации составить из частей
 *  слова “информатика” слово “торт”.
 */

package by.jonline.modul03.object_string;

public class Exercise04 {

	public static void main(String[] args) {

		String s = "информатика";

		System.out.println(getResult(s));

	}

	public static String getResult(String s) {

		String result;

		result = s.substring(7, 8);

		result = result.concat(s.substring(3, 5)) + s.substring(7, 8);

		return result;
	}
}
