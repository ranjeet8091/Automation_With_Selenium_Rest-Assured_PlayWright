package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringComparison {
   public static void main(String[] args) {
	   char[] chars = {'a','a','b','b','c','c','c'};	
//	   char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
	   
	   LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
	   ArrayList<Character> result=new ArrayList<>();
        for(char ch:chars) {
        	 map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()) {
        	 if(map.get(ch)==0) {
        		 result.add(ch);
        	 }
        	 else if(map.get(ch)>9 && map.get(ch)<100) {
        		 int count=map.get(ch);
        		 char first=(char) ((char)count/10);
        		 char second=(char) ((char)count%10);
        		 result.add(first);
        		 result.add(second);
        
        	 }
        	 else {
        		 int n=map.get(ch);
        		 char num=(char) ((char)n);
        		 result.add(num);
        	 }
        		 
        	 }
        
        System.out.println(result);
        }
        
}
