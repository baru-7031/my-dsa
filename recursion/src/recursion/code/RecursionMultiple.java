package recursion.code;

public class RecursionMultiple {

	int multiply(int m, int n) {
		if(n == 0) {
			return 0;
		}
		return m + multiply(m, n-1);
	}
	
	
	public static void main(String[] args) {
		
		RecursionMultiple obj = new RecursionMultiple();
		
		System.out.println(obj.multiply(4, 5));
		
		
	}
	
}






