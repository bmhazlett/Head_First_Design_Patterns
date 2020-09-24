public class ChocolateBoilerEager {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerEager uniqueChocolateBoilerEager = new ChocolateBoilerEager();
    
    private ChocolateBoilerEager() {
	empty = true;
	boiled = false;
    }

    public static ChocolateBoilerEager getInstance() {
	return uniqueChocolateBoilerEager;
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
