package StringPractice;

public class StringContainsElementOrNot {
    public static void main(String[] args) {
    	 String str="Ranjeet1";
    	 char arr[]=str.toCharArray();
    	 Boolean contains=false;
    	 for(char ch:arr) {
    		 if(Character.isDigit(ch)) {
    			 contains=true; 
    		 }
    	 }
    	 if(contains) {
    		 System.out.println("Yes");
    	 }
    	 else {
    		 System.out.println("No");
    	 }
    }
}
