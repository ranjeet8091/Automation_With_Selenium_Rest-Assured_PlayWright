package StringPractice;

import java.util.HashSet;

public class LongestSubsTringWithoutRepeatingCharacter {
	
	public static void main(String[] args) {
		String str="NLAGKACD";
		String MaxString="";
		String CurrString="";
		HashSet<Character> set=new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				CurrString+=str.charAt(i);
			}
			else {
				if(CurrString.length()>MaxString.length()) {
					MaxString=CurrString;
				}
				set.clear();
				set.add(str.charAt(i));
				CurrString="";
			}
		}
		System.out.println(MaxString);
		
	}

}
