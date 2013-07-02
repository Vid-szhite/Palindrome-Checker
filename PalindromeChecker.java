package palindromeChecker;
import java.text.Normalizer;
import java.util.Scanner;


public class PalindromeChecker {
	
	public static boolean isPalindrome(String s) {
		//Normalize the argument (Replaces special characters for ASCII ones, then removes white spaces and special characters.
		s = Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[^a-zA-Z]+", "").toLowerCase();
		//Variable for local manipulation
		//String reverse = new StringBuilder(s).reverse().toString();
		
		String reverse = "";
		
		//Reverse the string
		for (int i=s.length()-1; i>=0; i--) {
			reverse += s.charAt(i);
		}
		
		//Check if input is a palindrome
		if (reverse.equals(s)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args){
		//Declare local variables
		String phrase;
		String phraseReverse;
		Scanner userInput = new Scanner(System.in);
		
		//Ask for user input
		System.out.println("Type a word or phrase:");
		phrase = userInput.nextLine();
		
		//Check if input is a palindrome
		if (isPalindrome(phrase)) {
			System.out.println("Yes, this phrase is a palindrome!");
		} else {
			System.out.println("Sorry, this phrase is not a palindrome.");
		}
		
		//Display result to the user
		
	}
}