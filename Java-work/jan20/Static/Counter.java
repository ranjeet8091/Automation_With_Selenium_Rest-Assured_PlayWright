package Static;

public class Counter {
	static int count = 0;// static variable . this is also called as utilities

	Counter() {
		count++;
		System.out.println("Object Created. Count = " + count);
	}
}
