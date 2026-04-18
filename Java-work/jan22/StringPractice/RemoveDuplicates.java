package StringPractice;

import java.util.HashMap;

public class RemoveDuplicates {
   public static void main(String[] args) {
	   String str="Ranjeet";
	   char cha[]=str.toCharArray();
	   HashMap<Character,Integer> map=new HashMap<>();

	   String newString="";
	   for(char ch:cha) {
		   if( !map.containsKey(ch)) {
			   newString+=ch;
			   map.put(ch, 1);
		   }
	   }
	   System.out.println(newString);
	   
   }
}
