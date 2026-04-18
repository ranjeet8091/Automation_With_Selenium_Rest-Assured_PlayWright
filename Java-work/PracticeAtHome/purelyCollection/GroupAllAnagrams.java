package purelyCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAllAnagrams {
  public static void main(String[] args) {
	  String[] input= {"eat", "tea", "tan", "ate", "nat", "bat"};
	  HashMap<String, ArrayList<String>>map=new HashMap<>(); // key will be my sorted String 
	  ArrayList<ArrayList<String>>result=new ArrayList<>();
	  
	  for(String str:input) {
		  char[] arr=str.toCharArray();
		  Arrays.sort(arr); 
		  String anagram=new String(arr);
		  if(!map.containsKey(anagram)) {  // if not  contains then create new arrayList corresponding to the String
			  ArrayList<String> list=new ArrayList<>();
			  list.add(str);
			  map.put(anagram,list);
		  }
		  else {  // simply retrieve the list with the help of List and add new Anagram
			  map.get(anagram).add(str);
		  }
	  }
	  for(String str:map.keySet()) {
		  result.add(map.get(str));
	  }
	  System.out.print(result);
  }
}
