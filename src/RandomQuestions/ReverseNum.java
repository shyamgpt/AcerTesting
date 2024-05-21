package RandomQuestions;

public class ReverseNum {
	
	public static int revseNum(int num) {
		int reverseNum =0;
		while(num> 0) {
			reverseNum = reverseNum*10 + num %10;
			num = num/10;
		}
		return reverseNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =420;
		
	int res = 	revseNum(num);
	System.out.println(res);
		

	}

}
