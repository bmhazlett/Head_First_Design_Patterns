public class Tea {

    void prepareRecipe() {
	boilWater();
	brewCoffeeGrinds();
	pourInCup();
	addSugarAndMilk();
    }

    public void boilWater() {
	System.out.println("Boiling water");
    }

    public void steepTeaBag() {
	System.out.println("Steeping the tea");
    }

    public void addLemon() {
	System.out.println("Adding Sugar and Milk");
    }
    
    public void pourInCup() {
	System.out.println("Pouring into cup");
    }
}
