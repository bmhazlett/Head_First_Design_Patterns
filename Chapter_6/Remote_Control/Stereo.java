public class Stereo {
    boolean power;
    String mode;
    int volume;
    String location;

    public Stereo(String loc) {
	power = false;
	mode = "CD";
	volume = 5;
	location = loc;
    }

    public void on() {
	System.out.println(location + " Stereos on");
	power = true;
    }
    
    public void off() {
	System.out.println(location + " Stereos off");
	power = false;
    }

    public void setCd() {
	System.out.println(location + " Play CD");
	mode = "CD";
    }

    public void setDvd() {
	System.out.println(location + " Play DVD");
	mode = "DVD";	
    }

    public void setRadio() {
	System.out.println(location +" Play RADIO");
	mode = "RADIO";	
    }

    public void setVolume(int vol) {
	this.volume = vol;
	System.out.println(location + " Volume: " + volume);
    }

    public String getName() {
	return location;
    }
}
