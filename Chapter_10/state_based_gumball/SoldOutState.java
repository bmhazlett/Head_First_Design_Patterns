public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState (GumballMachine gumballMachine) {
	this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
	System.out.println("You can't insert a quarter we are sold out");
    }

    public void ejectQuarter() {
	System.out.println("No Quarter to eject");
    }

    public void turnCrank() {
	System.out.println("You can't turn the crank we are sold out");
    }

    public void dispense() {
	System.out.println("We can't dispense because we are sold out");
    }
}
