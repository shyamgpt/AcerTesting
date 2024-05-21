package RandomQuestions;

public class factorialUsingRecursion {
	
	public static int factRecursion(int num) {
//		int finalAns =1;
		if(num ==0) {
			return 1;
		}
		
		int smallOutput = factRecursion(num-1);
	
		int  finalAns = num*smallOutput;
		 return finalAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rs = factRecursion(5);
		System.out.println(rs);

	}

}
