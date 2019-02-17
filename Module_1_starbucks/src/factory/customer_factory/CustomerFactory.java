package factory.customer_factory;

import base.Customer;
import base.random.RandomCoffee;
import factory.coffee_factory.CoffeeType;

public class CustomerFactory {

    RandomCoffee randomCoffee = new RandomCoffee();

    public  Customer createCustomer() {
        return new Customer(randomCoffee.getRandomCoffee());
    }
}
