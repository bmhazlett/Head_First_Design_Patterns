public class Quackologist implements Observer {
    public void update(QuackObservable duck) {
	System.out.println("Quackologies: " + duck + " just quacked.");
    }
}
