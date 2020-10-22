public class HomeTheatreFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheatreLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheatreFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, Screen screen, TheatreLights lights, PopcornPopper popper) {
	this.amp = amp;
	this.tuner = tuner;
	this.dvd = dvd;
	this.cd = cd;
	this.projector = projector;
	this.screen = screen;
	this.lights = lights;
	this.popper = popper;
    }

    public void watchMovie(String movie) {
	System.out.println("Get ready to watch a movie...");
	popper.on();
	popper.pop();
	lights.dim();
	screen.down();
	projector.on();
	projector.wideScreenMode();
	amp.on();
	amp.setDvd(dvd);
	amp.setSurroundSound();
	amp.setVolume(5);
	dvd.on();
	dvd.play();
    }

    public void endMovie() {
	System.out.println("Shutting movie theatre down...");
	popper.off();
	lights.on();
	screen.up();
	amp.off();
	dvd.stop();
	dvd.eject();
	dvd.off();
    }
}
