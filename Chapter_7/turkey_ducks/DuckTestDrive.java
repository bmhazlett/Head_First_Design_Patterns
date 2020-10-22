public class DuckTestDrive {
    public static void main(String[] main) {
	MallardDuck duck = new MallardDuck();

	WildTurkey turkey = new WildTurkey();
	Duck turkeyAdapter = new TurkeyAdapter(turkey);
	Turkey duckAdapter = new DuckAdapter(duck);

	System.out.println("The turkey says...");
	testTurkey(turkey);
	
	System.out.println("\n The Duck says...");
	testDuck(duck);

	System.out.println("\n The TurkeyAdapter says...");
	testDuck(turkeyAdapter);

	System.out.println("\n The DuckAdapter says...");
	testTurkey(duckAdapter);

	
    }

    static void testDuck(Duck duck) {
	duck.quack();
	duck.fly();
    }

    static void testTurkey(Turkey turkey) {
	turkey.gobble();
	turkey.fly();
    }
}
