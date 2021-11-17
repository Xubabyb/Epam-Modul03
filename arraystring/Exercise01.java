
/*
 * Дан массив названий переменных в camelCase. 
 * Преобразовать названия в snake_case.
 */

package by.jonline.modul03.arraystring;

import java.util.Arrays;

public class Exercise01 {

	public static void main(String[] args) {

		String[] literals = { "numberMin", "numberMaxElement", "numberMidElAr" };

		System.out.println(Arrays.toString(literals));

		reformation(literals);

		System.out.println(Arrays.toString(literals));

	}

	public static void reformation(String[] literals) {

		for (int i = 0; i < literals.length; i++) {

			char[] ch = literals[i].toCharArray();// преобразуем строку в массив символов

			ch = insChar(ch);// находим место и вставляем _

			literals[i] = String.copyValueOf(ch);// преобразуем массив символов в строку

			literals[i] = literals[i].toLowerCase();// строку приводим к нижнему регистру

		}
	}

	public static char[] insChar(char[] ch) {

		for (int i = 0; i < ch.length; i++) {

			if (Character.isUpperCase(ch[i])) {

				ch = Arrays.copyOf(ch, ch.length + 1);

				for (int j = ch.length - 1; j > i; j--) {

					ch[j] = ch[j - 1];

				}

				ch[i] = '_';

				i += 1;
			}

		}
		return ch;
	}

}
