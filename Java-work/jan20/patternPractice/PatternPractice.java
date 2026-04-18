package patternPractice;

public class PatternPractice {

	
	public void Question4(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
//	// output 
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 

	public void Question7(int n) {

		for (int i = n; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
//	output
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 


//public  void Question8(int n) {
//		int size=n;
//		for(int i=1;i<=n;i+=2) {
//			
//			for(int j=1;j<=((size-1)/2)*2;j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			size-=2;
//			System.out.println();
//			
//		}
//		
//	}

//	Second approach  (Right Approach)  pyramid
	public void Question8(int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
//	output
//	    *
//	   ***
//	  *****
//	 *******
//	*********


	public  void Question9(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=(i-1)*2;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*(n-i))+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
//	}
//	output
//	* * * * * * * * * 
//	  * * * * * * * 
//	    * * * * * 
//	      * * * 
//	        * 

//		print regular pyramid
	public void Question10(int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}
//	output
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 


}
