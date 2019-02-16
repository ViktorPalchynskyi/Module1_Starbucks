package base;

import factory.coffee_factory.CoffeeType;

public class Customer {

    private CoffeeType coffeeType;

    public Customer(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public CoffeeType orderCoffee (){
        return coffeeType;
    };


}
