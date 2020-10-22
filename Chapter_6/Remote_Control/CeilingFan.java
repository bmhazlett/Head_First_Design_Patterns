public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
    public CeilingFan(String loc) {
	speed = OFF;
	this.location = loc;
    }

    public void high() {
	System.out.println(location + " Ceiling Fan HIGH");
	speed = HIGH;
    }

    public void medium() {
	System.out.println(location + " Ceiling Fan MEDIUM");
	speed = MEDIUM;
    }

    public void low() {
	System.out.println(location + " Ceiling Fan LOW");
	speed = LOW;
    }

    public void off() {
	System.out.println(location + " Ceiling Fan off");
	speed = OFF;
    }

    public int getSpeed() {
	return speed;
    }

    public String getName() {
	return location;
    }

    
}
