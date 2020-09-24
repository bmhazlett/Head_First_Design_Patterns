public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake() {
	System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
	System.out.println("Cutting the pizza into diagonal slices");	
    }

    void box() {
	System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
	this.name = name;
    }

    String getName() {
	return name;
    }

    public String toString() {
	String returnString = "Dough: " + dough.getName();
	returnString += "\nSauce: " + sauce.getName();
	returnString += "\nCheese: " + cheese.getName();
	if (pepperoni != null) {
	    returnString += "\nPepperoni: " + pepperoni.getName();
	}
	if(clam != null) {
	    returnString += "\nClams: " + clam.getName();
	}
	if (veggies != null) {
	    returnString += "\nVeggies: ";
	    for (int i = 0; i < veggies.length; i++) {
		returnString += "\t\n" + veggies[i];
	    }
	}

	return returnString;
	
    }

}

