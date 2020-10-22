public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    int volume;
    
    public void on() {
	System.out.println("Amplifier turns on");
    }

    public void off() {
	System.out.println("Amplifier turns off");
    }

    public void setCd(CdPlayer cd) {
	System.out.println("Amplifier Cd Set");
	this.cdPlayer = cd;
    }

    public void setDvd(DvdPlayer dvd) {
	System.out.println("Amplifier dvd set");
	this.dvdPlayer = dvd;
    }

    public void setStereoSound() {
	System.out.println("Amplifier stereo sound set");
    }

    public void setSurroundSound() {
	System.out.println("Amplifier surround sound set");
    }

    public void setTuner(Tuner tuner) {
	System.out.println("Amplifier set tuner");
	this.tuner = tuner;
    }

    public void setVolume(int vol) {
	System.out.println("Amplifier volumn set to: " + vol);
	this.volume = vol;
    }
}
