package ExceptionHandling;

public class TestingException {
    public static void main(String[] args) {
    	try {
    		 int n=-10;
        	 int m=0;
        	 int ans=n/m;
    	}
    	catch(ArithmeticException e) {
    		System.out.println(e);
    		System.out.println("Error: Division by Zero is not allowd");
    	}
    	finally {
    		System.out.println("Program continues after handling the exception");
    	}
    	 
    }
}
