public class Tuner {
    Amplifier amp;
    public void on() {
	System.out.println("Tuner on");
    }
    public void off() {
	System.out.println("Tuner off");
    }
    public void setAm() {
	System.out.println("Tuner set to AM");
    }
    public void setFm() {
	System.out.println("Tuner set to FM");
    }
    public void setFrequency(int freq) {
	System.out.println("Frequency set to: " + freq);
    }
    
}
