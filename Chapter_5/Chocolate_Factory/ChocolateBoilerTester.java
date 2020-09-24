public class ChocolateBoilerTester {
    public static void main(String args[]) {
	ChocolateBoiler cb = ChocolateBoiler.getInstance();

	cb.drain();
	cb.fill();
	cb.boil();
	cb.drain();
	cb.fill();
	cb.boil();
	cb.fill();
	cb.boil();
	cb.drain();
    }
}
