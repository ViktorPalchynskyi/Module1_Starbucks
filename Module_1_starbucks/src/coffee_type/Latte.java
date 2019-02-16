package coffee_type;

public class Latte  extends BaseCoffee {
    private int milk;

    public Latte(int water, int coffeeSeed, int sugar, int cup, int milk) {
        super(water, coffeeSeed, sugar, cup);
        this.milk = milk;
    }
}
