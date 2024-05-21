package stringPrograms;

import java.util.Scanner;

public class CountUpperCase {
	
	public static int countUprCaseChar(String str) {
		int count = 0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) > 'A' && str.charAt(i) < 'Z') {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter");
		String str = s.nextLine();
		int res = countUprCaseChar(str);
		System.out.println(res);

	}

}
