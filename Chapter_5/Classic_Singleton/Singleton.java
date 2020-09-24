public class Singleton {
    private static Singleton uniqueInstance;

    // other variables

    // Private constructor
    private Singleton() { }

    public static Singleton getInstance() {
	// If not singleton then make one
	if (uniqueInstance == null) {
	    System.out.println("NEW SINGLETON CREATED");
	    uniqueInstance = new Singleton();
	} else {
	    System.out.println("USED THE OLD ONE");
	}
	
	return uniqueInstance;
    }

    // other methods
    
}
