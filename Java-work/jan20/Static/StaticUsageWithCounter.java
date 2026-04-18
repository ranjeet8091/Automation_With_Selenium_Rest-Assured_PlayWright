package Static;


public class StaticUsageWithCounter {
	public static void main(String args[]) {
		 new Counter();//
		new Counter();// Counter increases Because of shared variable count
		new Counter();
		Counter c3 = new Counter();//
		System.out.println(c3.count);// this not good practice . we can retrieve the variable only with the help
										// Class
		System.out.println("Total Count is --" + Counter.count + "--");

	}
}
