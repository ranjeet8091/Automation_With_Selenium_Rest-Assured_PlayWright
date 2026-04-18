package LongestPalidrome;

public class Main {
	
	public static boolean checkPalidrom(String str) {
		String newStr=new StringBuilder(str).reverse().toString();
		if(str.equals(newStr)) {
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		String str="naman RanjeetTiwariaba";
		
		String maxString="";
		  for(int i=0;i<str.length();i++) {
			 
			  for(int j=i;j<=str.length();j++) {
				  String newStr=str.substring(i,j);
				  if(newStr.length()>maxString.length() && checkPalidrom(newStr)) {
					  maxString=newStr;
				  }
			  }
		  }
		System.out.println(maxString);
	}

}
