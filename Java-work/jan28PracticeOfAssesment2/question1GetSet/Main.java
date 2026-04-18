package question1GetSet;

public class Main {
    public static void main(String[] args) {
    	  Person p1=new Person();
    	  Person p2=new Person();
    	  
    	  p1.setName("Ranjeet");
    	  p1.setAge(23);
    	  
    	  p2.setName("Vibhor");
    	  p2.setAge(21);
    	  
    	  System.out.println("Person name is " +p1.getName()+" and age is "+p1.getAge());
    	  
    	  System.out.println("Person name is " +p2.getName()+" and age is "+p2.getAge());
    	  
    }
}
