package com.ranjeetCore.copy;

public class Palidrome {
	
	public static boolean CheckPalidrom(String Str) {
		String rev=new StringBuilder(Str).reverse().toString();
		
;		return rev==Str?true:false;
	}
	
	public static void  rootOfQuadratic(int a,int b,int c) {
		double D=(int)(Math.sqrt(b*b-4*a*c));
		if(D<0)
		{
			System.out.println("Root Imaginary");
		}
		else if(D>0)
		{
			int root1=(int)(-b+D)/2*a;
			int root2=(int)(-b-D)/2*a;
			System.out.println("2 roots" + "First 1 "+root1 + " Second Root "+ root2);
		}
		else if(D==0) {
			System.out.println("Same root");
		}
		
	}
	
	public static int Factorial(int n) {
		if(n==0)
			return 1;
		return n*Factorial(n-1);
	}
	
	public static String Reverse(String str) {
		String words[]=str.split(" ");
		String result="";
		for(String word:words) {
			String rev=new StringBuilder(word).reverse().toString();
			result+=rev+" ";
		}
		return result;
	}
	
    public static void main(String args[]) {
    	System.out.println(CheckPalidrom("Ranjeet"));
    	rootOfQuadratic(7,8,1);
    	
//    	int i=0 // pending
//    	for(;i<9;) {
//    		System.out.print(i + " ");
//    	}
    	
    	System.out.println(Factorial(5));
    	System.out.println(Reverse("My Name is Ranjeet"));
    	
    	
    }
}
