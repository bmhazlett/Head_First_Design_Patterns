public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    Observable observable;

    public QuackCounter(Quackable duck) {
	this.duck = duck;
	observable = new Observable(this);
    }

    public void quack() {
	duck.quack();
	numberOfQuacks++;
    }

    public static int getQuacks() {
	return numberOfQuacks;
    }

    public void registerObserver(Observer observer) {
	duck.registerObserver(observer);
    }

    public void notifyObservers() {
	duck.notifyObservers();
    }

}
