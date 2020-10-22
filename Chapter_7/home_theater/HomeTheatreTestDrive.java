public class HomeTheatreTestDrive {
    public static void main(String[] args) {
	PopcornPopper popper = new PopcornPopper();
	TheatreLights lights = new TheatreLights();
	Screen screen = new Screen();
	Projector projector = new Projector();
	Amplifier amp = new Amplifier();
	DvdPlayer dvd = new DvdPlayer();
	Tuner tuner = new Tuner();
	CdPlayer cd = new CdPlayer();

	HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

	homeTheatre.watchMovie("Raiders of the Lost Arc");
	homeTheatre.endMovie();

    }
}
