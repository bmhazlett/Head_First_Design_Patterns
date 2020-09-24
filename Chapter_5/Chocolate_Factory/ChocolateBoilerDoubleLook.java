public class ChocolateBoilerDoubleLook {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoilerDoubleLook uniqueChocolateBoilerDoubleLook;
    
    private ChocolateBoilerDoubleLook() {
	empty = true;
	boiled = false;
    }

    public static ChocolateBoilerDoubleLook getInstance() {
	if (uniqueChocolateBoilerDoubleLook == null) {
	    synchronized (ChocolateBoilerDoubleLook.class) {
		if (uniqueChocolateBoilerDoubleLook == null){
		    uniqueChocolateBoilerDoubleLook = new ChocolateBoilerDoubleLook();
		}
	    }
	}
	return uniqueChocolateBoilerDoubleLook;
    }
    
    public void fill() {
	if (isEmpty()) {
	    empty = false;
	    boiled = false;
	    System.out.println("FILL THE BOILER");
	} else {
	    System.out.println("ERROR -> BOILER IS NOT EMPTY");
	}
    }

    public void drain() {
	if (!isEmpty() && isBoiled()){
	    empty = true;
	    System.out.println("DRAIN THE BOILER");
	} else {
	    System.out.println("ERROR -> BOILER IS NOT BOILED");
	}
    }

    public void boil() {
	if (!isEmpty() && !isBoiled()) {
	    boiled = true;
	    System.out.println("BOIL THE BOILER");
	} else {
	    System.out.println("ERROR -> BOILER IS ALREADY BOILED OR EMPTY");
	}
    }

    public boolean isEmpty() {
	return empty;
    }

    public boolean isBoiled() {
	return boiled;
    }
	

}
