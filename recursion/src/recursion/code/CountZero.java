package recursion.code;

public class CountZero {

	int countZero(int n) {
		
		if(n < 10) {
			if(n == 0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		if(n%10 == 0) {
			return countZero(n/10)+1;
		}
		else {
			return countZero(n/10);
		}
		
	}
	
	public static void main(String[] args) {
		
		CountZero obj = new CountZero();
		
		System.out.println(obj.countZero(10020));
		

	}

}
