package RandomQuestions;

import java.util.Scanner;

public class primeNumberCheck {
	
	public static boolean primeCheck(int num) {
		if(num ==0 || num ==1) {
			return false;
		}
		if(num ==2) {
			return true;
		}
		for(int i =2 ;i<num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		boolean res =primeCheck(n);
		System.out.println(res);

	}

}
