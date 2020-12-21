import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;
    String location;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
	soldOutState = new SoldOutState(this);
	noQuarterState = new NoQuarterState(this);
	hasQuarterState = new HasQuarterState(this);
	soldState = new SoldState(this);
	winnerState = new WinnerState(this);

	this.location = location;
	this.count = numberGumballs;
	if (numberGumballs > 0) {
	    state = noQuarterState;
	}
    }

    public int getCount() {
	return count;
    }

    public State getState() {
	return state;
    }

    public String getLocation() {
	return location;
    }
    
    public State getNoQuarterState() {
	return noQuarterState;
    }

    public State getSoldOutState() {
	return soldOutState;
    }

    public State getHasQuarterState() {
	return hasQuarterState;
    }

    public State getSoldState() {
	return soldState;
    }

    public State getWinnerState() {
	return winnerState;
    }

    public void insertQuarter() {
	state.insertQuarter();
    }

    public void ejectQuarter() {
	state.ejectQuarter();
    }

    public void turnCrank() {
	state.turnCrank();
	state.dispense();
    }

    void setState(State state){
	this.state = state;
    }

    void releaseBall() {
	System.out.println("A gumball comes rolling out of the slot...");
	if (count != 0) {
	    count = count - 1;
	}
    }

    public String toString() {
	String outString = "";
	outString += "Mighty Gumball Inc.\n";
	outString += "Java-enabled Standing Gumball Model #2004\n";
	outString += "Inventory: ";
	outString += String.valueOf(count);
	outString += " gumballs\n";
	if (state == getNoQuarterState()) {
	    outString += "Machine is waiting for a quarter";
	} else if (state == getHasQuarterState()) {
	    outString += "Machine has a quarter";
	} else if (state == getSoldOutState()) {
	    outString += "Machine is sold out";
	} else if (state == getSoldState()) {
	    outString += "Machine is selling a gumball";
	} else if (state == getWinnerState()) {
	    outString += "Machine has found a winner";
	}
	return outString;

    }
}
