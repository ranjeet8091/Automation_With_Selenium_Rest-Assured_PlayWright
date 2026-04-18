package CarSpeedControl;

public class TestCar {
  public static void main(String arg[]) {
	  Car car=new Car();
	  
	  car.accelerate(30);
	  System.out.println("Current Speed is: "+ car.getSpeed());
	  
	  car.accelerate(180);
	  System.out.println("Current Speed is: "+ car.getSpeed());
	  
	  car.brake(50);
	  System.out.println("Current Speed is: "+ car.getSpeed());
	  
	  car.brake(190);
	  System.out.println("Current Speed is: "+ car.getSpeed());
	  
  }
}
