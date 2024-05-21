package stringPrograms;

public class OccuranceCheck {

	public static int occurCheck(String str) {
		char ch = 'y';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Geekyants is my company";
		int res = occurCheck(str);
		System.out.println(res);
	}

}
