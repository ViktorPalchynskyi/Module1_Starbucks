package coffe_makers;

import coffee_type.BaseCoffee;
import factory.coffee_factory.CoffeeCreator;
import factory.coffee_factory.CoffeeType;

public class CoffeeMachine implements MakeCoffeeInterface{
    private boolean isWork = true;

    public boolean isWork() {
        return isWork;
    }

    @Override
    public BaseCoffee makeCoffee(CoffeeCreator coffeeCreator) {
        return coffeeCreator.createCoffee(CoffeeType.AMERICANNO);
    }
}
