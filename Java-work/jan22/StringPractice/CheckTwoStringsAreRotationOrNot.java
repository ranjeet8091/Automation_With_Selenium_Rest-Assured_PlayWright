package StringPractice;

public class CheckTwoStringsAreRotationOrNot {
	 public static void main(String[] args) {
		   
		String S1="abcde";
		String S2="cdeab";
		 
		String s3=S1+S2;
		if(s3.contains(S1) && s3.contains(S2)) {
		 System.out.println("Yes");
	   }
		else {
			System.out.println("No");
		}

}
}
