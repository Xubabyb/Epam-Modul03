
/*
 *  Посчитать количество строчных (маленьких) и прописных (больших) букв 
 *  в введенной строке. Учитывать только английские буквы.
 */

package by.jonline.modul03.object_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise09 {

	public static void main(String[] args) throws IOException {

		String str = new String();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		str = reader.readLine();

//		count(str);
		
		System.out.println("Количество прописных букв = " + countUpperCase(str));
		
		System.out.println("Количество строчных букв = " + countLowerCase(str));

	}
	
	public static int countUpperCase(String s) {
		
		int countUpperCase = 0;
		
		for (int i = 0;i<s.length();i++) {
			
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				 
				countUpperCase ++;
			}
		}
		
		return countUpperCase;
	}
	public static int countLowerCase(String s) {
		
		int countLowerCase = 0;
		
		for (int i = 0;i<s.length();i++) {
	
			if (s.charAt(i)>='a'&&s.charAt(i)<='z') {
				
				countLowerCase ++;
			}
		}
		
		return countLowerCase;
	}
/*	public static void count(String s) {

		int countUpperCase = 0;

		int countLowerCase = 0;

		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i))) {

				countUpperCase++;
			}
			countLowerCase++;
		}

		System.out.println("Количество прописных букв  = " + countUpperCase);

		System.out.println("Количество строчных букв  = " + countLowerCase);
	}*/
}
