package InterfaceAndAbstract;

public class Car extends Vehicle implements  MusicSystem{
	void start() {
		System.out.println("Car started");
	}
	public void playMusic() {
		System.out.println("Playing music in car");
	}


}
