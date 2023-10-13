//All Lower Case letters should be shifted left by 3 characters
//All Upper Case letters should be shifted left by 2 characters
package practic;

//import scanner class
import java.util.Scanner;

public class ShiftLetters {
	public static void main(String[] args) {
		// initialize scanner
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String string = scanner.nextLine();
		
		// This method shifts the letters in the input string based on their case
		String shiftedString = shiftLetters(string);

		System.out.println("The shifted string is: " + shiftedString);
	}

	private static String shiftLetters(String string) {
		String shiftedString = "";
		// Iterate through each character in the input string
		for (char character : string.toCharArray()) {
			if (Character.isUpperCase(character)) {
				// If the character is an uppercase letter, shift it by 2 positions backward in the alphabet
				shiftedString = shiftedString + (char) (character - 2);
			} else if (Character.isLowerCase(character)) {
				// If the character is a lowercase letter, shift it by 3 positions backward in the alphabet
				shiftedString = shiftedString+ (char) (character - 3);
			} else {
				// If the character is not a letter, leave it unchanged
				shiftedString = shiftedString + character;
			}
		}
		// Return the resulting shifted string
		return shiftedString;
	}
}
