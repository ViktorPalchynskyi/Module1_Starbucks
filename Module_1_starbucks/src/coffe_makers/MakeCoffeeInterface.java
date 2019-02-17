package coffe_makers;

import coffee_type.BaseCoffee;
import factory.coffee_factory.CoffeeType;

public interface MakeCoffeeInterface {


    public BaseCoffee makeCoffee(CoffeeType coffeeType);



}
