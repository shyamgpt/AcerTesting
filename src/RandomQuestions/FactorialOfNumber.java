package RandomQuestions;

public class FactorialOfNumber {
	
	public static int factnum(int n) {
		int factRes  = 1;
		for(int i = n; i>0; i--) {
			 factRes = factRes*i;
			
		}
		return factRes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		System.out.println(factnum(num));

	}

}
