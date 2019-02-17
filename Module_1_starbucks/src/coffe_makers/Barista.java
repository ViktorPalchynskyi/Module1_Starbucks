package coffe_makers;

import coffee_type.BaseCoffee;
import factory.coffee_factory.CoffeeCreator;
import factory.coffee_factory.CoffeeType;

public class Barista implements MakeCoffeeInterface{
    @Override
    public BaseCoffee makeCoffee(CoffeeCreator coffeeCreator) {

        return coffeeCreator.createCoffee(CoffeeType.ESPRESSO);
    }
}
