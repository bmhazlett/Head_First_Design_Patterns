public class main {
    public static void main(String[] args) {
	PopcornPopper popper = new PopcornPopper();
	TheatreLights lights = new TheatreLights();
	Screen screen = new Screen();
	Projector projector = new Projector();
	Amplifier amp = new Amplifier();
	DvdPlayer dvd = new DvdPlayer();

	popper.on();
	popper.off();

	lights.dim();

	screen.down();

	projector.on();
	projector.setInput(dvd);
	projector.wideScreenMode();

	amp.on();
	amp.setDvd(dvd);
	amp.setSurroundSound();
	amp.setVolume(5);

	dvd.on();
	dvd.play();
    }
}
