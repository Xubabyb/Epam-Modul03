
/*
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово
 * и вывести его на экран. Случай, когда самых длинных слов может быть несколько, 
 * не обрабатывать.
 */

package by.jonline.modul03.object_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;

public class Exercise08 {

	public static void main(String[] args) throws IOException {

		String str = new String();

		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		str = x.readLine();

		System.out.println();

		System.out.println(findMaxLengthWord(str));

	}

	public static String findMaxLengthWord(String s) {

		String maxLengthWord = "";

		int maxLength = 0;

		String[] word = s.split(" ");
		
		//System.out.println(Arrays.toString(word));
		
		for (int i = 0;i < word.length;i++) {
			
			if (word [i].length()>maxLength) {
				
				maxLength = word[i].length();
				
				maxLengthWord = word[i];
			}
		}

		return maxLengthWord;
	}

}
