package ConstructorInvolkingRule;

public class Car extends Vehicle{
	Car(String brand){
		super("Four wheeler");
		System.out.println("Car constructor: "+brand);
	}

}
