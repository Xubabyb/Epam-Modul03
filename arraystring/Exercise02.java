
/*
 * Замените в строке все вхождения 'word' на 'letter'. 
 */

package by.jonline.modul03.arraystring; 

public class Exercise02 {

	public static void main(String[] args) {

		String str = "I will keep my word. I love the word \"Peace\"";
		
		System.out.println(str);

		String strfind = "word";

		str = str.contains(strfind) ? change(str) : str;

		System.out.println(str);
		
		// дописано 2 дня спустя
		str = str.replaceAll("letter", "word");
		
		System.out.println(str);
	}

	public static String change(String str) {

		StringBuilder x = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'w' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'r'
					&& str.charAt(i + 3) == 'd') {

				x.append("letter");

				i += 3;

			} else {

				x.append(str.charAt(i));
			}
		}

		str = x.toString();

		return str;

	}
}
