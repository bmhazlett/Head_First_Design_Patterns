public class CeilingFan {
    boolean status;
    String location;
    public CeilingFan(String loc) {
	status = false;
	location = loc;
    }

    public void on() {
	System.out.println(location + " Ceiling Fan on");
	status = true;
    }
    public void off() {
	System.out.println(location + " Ceiling Fan off");
	status = false;
    }

    public String getName() {
	return location;
    }

    
}
