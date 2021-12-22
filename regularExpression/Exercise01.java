package by.jonline.modul03.regularExpression;

import java.util.Arrays;
//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
 * выполнять с текстом три различных операции: отсортировать абзацы по
 * количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений
 * заданного символа, а в случае равенства – по алфавиту.
 */
public class Exercise01 {

	private static Pattern patternSentences = Pattern.compile("\\.*[.!?]\\s*");
	private static Pattern patternWords = Pattern.compile("([:|,|.|-]\\s)|\\s|\\.");
	/** Строковая переменная для тестирования класса */
	private static String test = "Первый абзац. Три предложения. Три!\n"
			+ "Второй абзац. Пять предложений. Это третье предложение. Это четвертое. И это пятое...\n"
			+ "Третий абзац и всего одно предложение.\n"
			+ "Четвертый абзац и семь предложений. Второе. Третье. Четвертое. Пятое. Шестое? Седьмое.\n"
			+ "Пятый абзац и снова одно предложение.\n" + "Шестой абзац. Привет, приветы, приветули.";

	public static void main(String[] args) {

		/* Если понадобиться ввод с клавиатуры
		 * @SuppressWarnings("resource") 
		 * Scanner scan = new Scanner(System.in);
		 * StringBuilder x = new StringBuilder(); 
		 * String check; 
		 * while(scan.hasNextLine() && !(check = scan.nextLine()).equals("")) {
		 * x.append(check).append("\n"); 
		 * } 
		 * String s = x.toString();
		 */

		sortParagraph(test);

		System.out.println("___________________");

		sortWord(test);

		System.out.println("___________________");

		sortLexemes(test, "е");

	}

	public static void sortLexemes(String text, String letter) {
		String[] paragrafhs = text.split("\n");

		for (String paragrafh : paragrafhs) {
			String[] strings = patternSentences.split(paragrafh);

			for (String sentences : strings) {
				String[] words = patternWords.split(sentences);
				// отсортируем строку заданную ввиде массива слов по алфавиту
				Arrays.sort(words);
				// сортируем по количеству вхождений letter
				for (int k = words.length - 1; k >= 0; k--) {
					for (int m = 0; m < k; m++) {
						int countRight = 0;
						int countLeft = 0;
						for (int n = 0; n < words[m].length(); n++) { // считаем количество вхождений
							if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
								countLeft++;
							}
						}
						for (int n = 0; n < words[m + 1].length(); n++) { // считаем количество вхождений следующего
																			// символа
							if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
								countRight++;
							}
						}
						if (countLeft < countRight) { // сравниваем количесво вхождений
							String tmp = words[m];
							words[m] = words[m + 1];
							words[m + 1] = tmp;
						}
					}
				}
				// вывод слов
				for (String word : words) {
					System.out.print(" " + word);
				}
				System.out.print(".");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void sortWord(String text) {
		String[] paragrafhs = text.split("\n");

		for (String paragrafh : paragrafhs) {

			String[] strings = patternSentences.split(paragrafh);

			for (String string : strings) {

				String[] words = patternWords.split(string);

				for (int i = 0; i < words.length; i++) {

					String minLengthWord = words[i];

					for (int j = i; j < words.length; j++) {

						if (words[j].length() < minLengthWord.length()) {

							words[i] = words[j];
							words[j] = minLengthWord;
							minLengthWord = words[i];
						}
					}
					System.out.print(" " + words[i]);

				}

				System.out.print(".");
			}
			System.out.println();
		}
	}

	public static int findSentenceFromParagraph(String text) {
		Matcher m = patternSentences.matcher(text);
		int count = 0;
		while (m.find()) {
			count++;
		}
		return count;
	}

	public static void sortParagraph(String text) {

		String[] str = text.split("\n");

		for (int i = 0; i < str.length; i++) {

			String temp = str[i];

			int tcount = findSentenceFromParagraph(str[i]);

			for (int j = i; j < str.length; j++) {

				int currentPar = findSentenceFromParagraph(str[j]);

				if (currentPar < tcount) {
					tcount = currentPar;
					str[i] = str[j];
					str[j] = temp;
					temp = str[i];
				}
			}
			System.out.println(str[i]);
		}

	}
}
