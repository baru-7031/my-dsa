package recursion.code;

public class Palindrome {

	boolean solve(String str, int start, int end) {
		
		if(start>=end) {
			return true;
		}
		
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		
		return solve(str, start+1,end-1);
		
	}
	
	
	public static void main(String[] args) {
		// str : malayalam
		
		Palindrome obj = new Palindrome();
		
		String str = "malayalam";
		
		System.out.println(obj.solve(str, 0, str.length()-1));

	}

}
