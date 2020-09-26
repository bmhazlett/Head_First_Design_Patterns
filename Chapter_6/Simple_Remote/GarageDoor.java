public class GarageDoor {

    boolean lightStatus;
    String doorPosition;
    
    public GarageDoor() {
	lightStatus = false;
	doorPosition = "Down";
    }

    public void up() {
	System.out.println("Garage Door Up");
	doorPosition = "Up";
    }

    public void down() {
	System.out.println("Garage Door Down");
	doorPosition = "Down";
    }

    public void stop() {
	System.out.println("Garage Door Stop");
	doorPosition = "Stop";
    }

    
    public void lightOn() {
	System.out.println("Lights on");
	lightStatus = true;
    }
    public void lightOff() {
	System.out.println("Lights off");
	lightStatus = false;
    }


}
