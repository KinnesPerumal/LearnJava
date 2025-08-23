package learnJavaProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
class EncorDec {
	public String encryption(String d, String k) {
		StringBuilder encrypt = new StringBuilder();
		int firstDigit = Integer.parseInt(String.valueOf(k.charAt(0)));
		int secondDigit = Integer.parseInt(String.valueOf(k.charAt(1)));
		int thirdDigit = Integer.parseInt(String.valueOf(k.charAt(2)));
		
		for(int i=0; i<d.length(); i++) {
			 char charvalue = d.charAt(i);
			 if(Character.isUpperCase(charvalue)) {
				 char encryptvalue = (char) ((int)charvalue - firstDigit);
				 encrypt.append(encryptvalue);
			 }else if(Character.isLowerCase(charvalue)) {
				 char encryptvalue = (char) ((int)charvalue - secondDigit);
				 encrypt.append(encryptvalue);
			 }else if(Character.isDigit(charvalue)) {
				 char encryptvalue = (char) ((int)charvalue - thirdDigit);
				 encrypt.append(encryptvalue);
			 }else {
				 encrypt.append(charvalue);
			 }
		}
//		System.out.println(encrypt);
		return encrypt.toString();
	}
	public String decryption(String d, String k) {
		StringBuilder decrypt = new StringBuilder();
		int firstDigit = Integer.parseInt(String.valueOf(k.charAt(0)));
		int secondDigit = Integer.parseInt(String.valueOf(k.charAt(1)));
		int thirdDigit = Integer.parseInt(String.valueOf(k.charAt(2)));
		
		for(int i=0; i<d.length(); i++) {
			 char charvalue = d.charAt(i);
			 if(Character.isUpperCase(charvalue+firstDigit)) {
				 char decryptvalue = (char) ((int)charvalue + firstDigit);
				 decrypt.append(decryptvalue);
			 }else if(Character.isLowerCase(charvalue+secondDigit)) {
				 char decryptvalue = (char) ((int)charvalue + secondDigit);
				 decrypt.append(decryptvalue);
			 }else if(Character.isDigit(charvalue+thirdDigit)) {
				 char decryptvalue = (char) ((int)charvalue + thirdDigit);
				 decrypt.append(decryptvalue);
			 }else {
				 decrypt.append(charvalue);
			 }
		}
//		System.out.println(decrypt);
		return decrypt.toString();
	}
}

public class _48_EncryptionOrDecryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		List<String> values = Arrays.stream(input.split(",")).collect(Collectors.toList());
		String d = values.get(0);
		String k = values.get(1);
		EncorDec en = new EncorDec();
		String encryption = en.encryption(d, k);
		String decryption = en.decryption(encryption, k);
		System.out.println(encryption+", "+decryption);
		
		sc.close();

	}

}
