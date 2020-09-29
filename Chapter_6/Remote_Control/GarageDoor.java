public class GarageDoor {

    boolean lightStatus;
    String doorPosition;
    String location;
    
    public GarageDoor(String loc) {
	lightStatus = false;
	doorPosition = "Down";
	location = loc;
    }

    public void up() {
	System.out.println(location + " Garage Door Up");
	doorPosition = "Up";
    }

    public void down() {
	System.out.println(location + " Garage Door Down");
	doorPosition = "Down";
    }

    public void stop() {
	System.out.println(location + " Garage Door Stop");
	doorPosition = "Stop";
    }
    
    public void lightOn() {
	System.out.println(location + " Lights on");
	lightStatus = true;
    }
    public void lightOff() {
	System.out.println(location + " Lights off");
	lightStatus = false;
    }
    
    public String getName() {
	return location;
    }

}
