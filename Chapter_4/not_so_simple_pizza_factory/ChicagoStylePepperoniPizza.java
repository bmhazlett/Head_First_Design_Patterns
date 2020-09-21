public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
	name = "Chicago Style Deep Dish Pepperoni Pizza";
	dough = "Extra Thick Crust Dough";
	sauce = "Plum Tomato Sauce";

	toppings.add("Shredded Mozzarella Cheese");
	toppings.add("Shredded Parmesan Cheese");
	toppings.add("Eggplant");
	toppings.add("Spinach");
	toppings.add("Black Olives");
	toppings.add("Pepperoni");

    }
    void cut() {
	System.out.println("Cutting the pizza into square slices");	 
    }

}
