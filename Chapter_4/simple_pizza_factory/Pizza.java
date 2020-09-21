public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare() {
	System.out.println("Preparing " + name);
	System.out.println("Tossing dough...");
	System.out.println("Adding sauce...");
    }

    void bake() {
	System.out.println("Bake for 25 minutes at 350");
    }
    
    void cut() {
	System.out.println("Cut diagonal");
    }
    
    void box() {
	System.out.println("Place in official PizzaStore box");
    }

    public String getName() {
	return name;
    }
}
