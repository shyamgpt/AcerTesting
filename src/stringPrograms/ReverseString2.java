package stringPrograms;

import java.util.Scanner;

public class ReverseString2 {
	
	public static String inputString() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str = s.next();
		return str;
		
	}
	
	public static String revStr(String str) {
		String reverStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverStr =reverStr+ str.charAt(i) ;
		}
		return reverStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = inputString();
//		System.out.println(str.length());
		String res = revStr(str);
		for(int i =0; i<res.length(); i++) {
			System.out.print(res.charAt(i));
		}
		

	}

}
