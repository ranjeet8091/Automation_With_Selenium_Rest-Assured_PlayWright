package StringPractice;

public class OurTrimMethod {
   public static void main(String[] args) {
	   String str="  Ranjeet   ";
	   char arr[]=str.toCharArray();
	   System.out.println(str);
	   int start=0;
	   int end=0;
		  for(int i=0;i<arr.length;i++) {
			   if(arr[i]!=' ') {
				  start=i;
				  break;
			   }
		   }
		  for(int i=arr.length-1;i>=0;i--) {
			   if(arr[i]!=' ') {
				  end=i;
				  break;
			   }
		   }
		  String newstr=str.substring(start,end+1);
		  System.out.println(newstr);
		  
	  
   }
}
