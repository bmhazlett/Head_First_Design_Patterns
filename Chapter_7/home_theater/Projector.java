public class Projector {
    DvdPlayer dvdPlayer;
    public void on() {
	System.out.println("Projector turns on");
    }
    public void off() {
	System.out.println("Projector turns off");
    }
    public void tvMode() {
	System.out.println("Projector in tv mode");
    }
    public void wideScreenMode() {
	System.out.println("Projector in wide screen mode");
    }
    public void setInput(DvdPlayer dvd) {
	System.out.println("Projector set input");
	dvdPlayer = dvd;
    }
}
