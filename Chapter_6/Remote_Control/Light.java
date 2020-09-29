public class Light {
    boolean status;
    String location;
    
    public Light(String loc) {
	status = false;
	location = loc;
    }

    public void on() {
	System.out.println(location + " Lights on");
	status = true;
    }
    public void off() {
	System.out.println(location + " Lights off");
	status = false;
    }

    public String getName() {
	return location;
    }
    
}
