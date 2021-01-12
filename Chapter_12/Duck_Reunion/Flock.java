import java.util.*;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    Observable observable;

    public void add(Quackable quacker) {
	quackers.add(quacker);
	observable = new Observable(this);
    }

    public void quack() {
	Iterator iterator = quackers.iterator();
	while (iterator.hasNext()) {
	    Quackable quacker = (Quackable)iterator.next();
	    quacker.quack();
	}
    }

    public void registerObserver(Observer observer) {
	Iterator iterator = quackers.iterator();
	while (iterator.hasNext()) {
	    Quackable quacker = (Quackable)iterator.next();
	    quacker.registerObserver(observer);
	}
    }

    public void notifyObservers() {    }

}
