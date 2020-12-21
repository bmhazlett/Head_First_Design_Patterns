public class WinnerState implements State {
    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
	this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
	System.out.println("You are a winner you don't need to insert a quarter!");
    }

    public void ejectQuarter() {
	System.out.println("You are a winner quarter cannot be ejected");
    }

    public void turnCrank() {
	System.out.println("You have already turned the crank");
    }

    public void dispense() {
	System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
	gumballMachine.releaseBall();
	if (gumballMachine.getCount() == 0) {
	    gumballMachine.setState(gumballMachine.getSoldOutState());
	} else {
	    gumballMachine.releaseBall();
	    if (gumballMachine.getCount() > 0) {
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	    } else {
		System.out.println("Oops, out of gumballs!");
		gumballMachine.setState(gumballMachine.getSoldOutState());
	    }
	}
    }
}
