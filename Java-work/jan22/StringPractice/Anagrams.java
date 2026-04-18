package StringPractice;

import java.util.HashMap;

public class Anagrams {
     public static void main(String args[]) {
    	 HashMap<Character,Integer> map=new HashMap<>();
    	   String str1="listen";
    	   String str2="sileent";
    	   boolean anagram=true;
    	   
    	   if(str1.length() == str2.length()) {
    		   
    		   for(int i=0;i<str1.length();i++) {
    			   map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i), 0)+1);
    		   }
    		   
    		   for(int i=0;i<str2.length();i++) {
    			   map.put(str2.charAt(i),map.getOrDefault(str2.charAt(i), 0)-1);
    		   }
    		   
    		   for(Character ch:map.keySet()) {
    			   if(map.get(ch) !=0) {
    				   anagram =false;
    			   }
    		   }
    		  if(anagram) {
    			  System.out.println("Anagram");
    		  }
    		  else {
    			  System.out.println("Not Anagram");
    		  }
    		   
    	   }
    	   else
    	   System.out.println("Not Anagram");
    	   
     }
}
