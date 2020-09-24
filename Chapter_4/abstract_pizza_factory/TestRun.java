public class TestRun {
    public static void main(String args[]) {
	PizzaStore nyPizzaStore = new NYPizzaStore();
	Pizza myPizza = nyPizzaStore.orderPizza("veggie");

	System.out.println(myPizza);

    }
}
