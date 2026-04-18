package StringPractice;

public class CountVowelsAndConsonant {
    public static void main(String[] args) {
    	 String str="Ranjeet1";
    	 int vowelsCount=0;
    	 int consonantCount=0;
    	 for(int i=0;i<str.length();i++) {
    		 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'  ) {
    			 vowelsCount++;
    		 }
    		 else if(!Character.isDigit(str.charAt(i))){
    			 consonantCount++;
    		 }
    	 }
    	 System.out.println("Vowel Count "+ vowelsCount + " ConsonantCount : "+consonantCount);
    }
}
