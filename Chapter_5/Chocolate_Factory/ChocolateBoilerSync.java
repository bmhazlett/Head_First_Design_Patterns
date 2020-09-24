public class ChocolateBoilerSync {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerSync uniqueChocolateBoilerSync;
    
    private ChocolateBoilerSync() {
	empty = true;
	boiled = false;
    }

    public static synchronized ChocolateBoilerSync getInstance() {
	if (uniqueChocolateBoilerSync == null) {
	    uniqueChocolateBoilerSync = new ChocolateBoilerSync();
	}
	return uniqueChocolateBoilerSync;
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
