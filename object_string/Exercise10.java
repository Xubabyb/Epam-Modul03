
/*
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 *  восклицательным или вопросительным знаком. Определить количество предложений
 *  в строке X.
 */

package by.jonline.modul03.object_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise10 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String x = new String();

		x = reader.readLine();

		System.out.println("Количество предложение - " + countSentences(x));

	}

	public static int countSentences(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') {

				count++;
			}
		}

		return count;
	}
}
