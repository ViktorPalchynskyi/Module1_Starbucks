package coffee_type;

public abstract class BaseCoffee {
    private int water;
    private int coffeeSeed;
    private int sugar;
    private int cup;

    public BaseCoffee(int water, int coffeeSeed, int sugar, int cup) {
        this.water = water;
        this.coffeeSeed = coffeeSeed;
        this.sugar = sugar;
        this.cup = cup;
    }
}
