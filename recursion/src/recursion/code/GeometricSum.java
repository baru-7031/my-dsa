package recursion.code;

public class GeometricSum {

	double metrix(int n) {
		
		if(n == 0) {
			return 1;
		}
		return metrix(n-1) + 1 / Math.pow(2, n);
	}
	
	
	public static void main(String[] args) {
		
		GeometricSum obj = new GeometricSum();
		
		System.out.println(obj.metrix(5));

	}

}
