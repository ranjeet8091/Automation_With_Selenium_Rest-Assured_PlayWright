package PracticeQuestion;

public class NearestPalidrome {
	static boolean palidrome(int n) {
		int num=n;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		if(rev==n) {
			return true;
		}
		else {
			return false;
		}
	}
   public static void main(String[] args) {
	   int num=234;
	   System.out.println(palidrome(num));
	   if(!palidrome(num)) {
		   int lenP=0;
		   int ValP=-1;
		   int lenM=0;
		   int ValM=-1;
		   for(int i=num+1;;i++) {
			   if(palidrome(i)) {
				   lenP=i-num;
				   ValP=i;
				   break;
			   }
		   }
		   
		   for(int i=num-1;i>=0;i--) {
			   if(palidrome(i)) {
				   lenM=num-i;
				   ValM=i;
				   break;
			   }
		   }
		   
		   if(lenP<lenM) {
			   System.out.println(ValP);
		   }
		   else {
			    System.out.println(ValM);
		   }
	   }
	   else {
		   System.out.println("Number is already palidrome");
	   }
	   
   }
}
