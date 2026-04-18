package CarSpeedControl;

public class Car {
    private int speed;
    public void accelerate(int amount) {
    	int newSpeed=speed+amount;
    	if(newSpeed>180) {
    		System.out.println("  --OverSpeeding--   You are accelerating with " +amount+ "  and your desire speed is " +newSpeed +  " i can add only " + (newSpeed-180));
    	    speed=180;
    	}
    	else {
    		speed+=amount;
    	}
    }
    public void brake(int amount) {
    	int newSpeed=speed-amount;
    	if(newSpeed<0) {
    		System.out.println("Speed can not be zero so can apply only on " + (speed));
    		speed=0;
    	}
    	else {
    		speed-=amount;
    	}
    }
    public int getSpeed() {
    	return speed;
    }
}
