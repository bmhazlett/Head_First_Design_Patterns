public class BeatController implements ControllerInterface {
    BeatModelInterface model;
    DJView view;

    public BeatController(BeatModelInterface model) {
	this.model = model;
	view = new DJView(this, model);
	view.createView();
	view.createControls();
	view.disableStopMenuItem();
	view.enableStartMenuItem();
	model.initialize();
    }

    public void start() {
	System.out.println("Controller Start");
	model.on();
	view.disableStartMenuItem();
	view.enableStopMenuItem();
    }

    public void stop() {
	System.out.println("Controller Stop");
	model.off();
	view.disableStopMenuItem();
	view.enableStartMenuItem();
    }

    public void increaseBPM() {
	int bpm = model.getBPM();
	model.setBPM(bpm + 1);
    }

    public void decreaseBPM() {
	int bpm = model.getBPM();
	model.setBPM(bpm - 1);
    }

    public void setBPM(int bpm) {
	model.setBPM(bpm);
    }
}
