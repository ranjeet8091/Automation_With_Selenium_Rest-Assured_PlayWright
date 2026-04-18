package List;

import java.util.ArrayList;
import java.util.List;

public class ListDamo {
 public static void main(String[] args) {
//	  Creating a List of String using ArrayList
	 List<String> li=new ArrayList<String>();
	 
//	 Adding elements in List
	 li.add("java");
	 li.add("Python");
	 li.add("DSA");
	 
	 System.out.println("Elements of List are : ");
	 
	 for(String s:li) {
		 System.out.println(s);
	 }
	 
//	 Accessing elements
	 System.out.println("Element at index 1: "+li.get(1));
	 
//	  updating elements
	 li.set(1, "JavaScript");
	 
//	 Removing elements
	 System.out.println("List after Removing Element: " + li);
 }
}
