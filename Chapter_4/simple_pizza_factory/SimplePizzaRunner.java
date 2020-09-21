public class SimplePizzaRunner {
    public static void main(String args[]) {
	SimplePizzaFactory testFactory = new SimplePizzaFactory();
	PizzaStore testStore = new PizzaStore(testFactory);

	Pizza pizza = testStore.orderPizza("cheese");
	System.out.println("Ben ordered a " + pizza.getName());
    }
}


