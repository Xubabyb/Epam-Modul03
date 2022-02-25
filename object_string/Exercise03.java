
/*
 * Проверить, является ли заданное слово палиндромом. 
 */

package by.jonline.modul03.object_string;

public class Exercise03 {
	public static void main(String[] args) {
 		String text = "Madam  i'm Adam";
        	System.out.println(isPalindrome(text));
    	}

    	public static boolean isPalindrome(String text) {
        	
		text = text.replaceAll("[^a-zA-Z0-9]", "");

        	String reverse = new StringBuilder(text).reverse().toString();

        	return text.equalsIgnoreCase(reverse);
    }
		
}
