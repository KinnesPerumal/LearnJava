package learnJavaProblems;

import java.util.Scanner;

class alphabetVowel{
	public String vowel(char C) {
		String Alphabet = "Not a Vowel";
		if(C== 'a' || C=='e' ||C=='i' || C=='o' || C=='u') {
			Alphabet = "Vowel";
		}
		return Alphabet;
	}
}

public class _11_AlphabetVowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Char letter: ");
		String C = sc.next();
		alphabetVowel av = new alphabetVowel();
		String Alpha = av.vowel(C.toLowerCase().charAt(0));
		System.out.println(Alpha);
		
	}

}
