public class Light {
    boolean status;

    public Light() {
	status = false;
    }

    public void on() {
	System.out.println("Lights on");
	status = true;
    }
    public void off() {
	System.out.println("Lights off");
	status = false;
    }
    
}
