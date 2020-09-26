public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCCommand(Stereo stereo) {
	this.stereo = stereo;
    }

    public void execute() {
	stereo.on();
	stereo.setCD();
	stereo.setVolume(11);
    }

}
