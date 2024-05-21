package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = s.next();
		return str;

	}

	public static String RevrString(String str) {
		String revStr = "";
		for (int i = 0; i < str.length(); i++) {
			revStr = str.charAt(i) + revStr;
		}
		return revStr;
	}
	
	public static void printString(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "Shyam"
		String str = inputString();
		String res = RevrString(str);
		printString(res);

	}

}
