package base;


import factory.coffee_factory.CoffeeCreator;
import factory.coffee_factory.CoffeeType;

public class StarBucksCoffee {

    CoffeeCreator coffeeCreator;

    public void serveCustomer(Customer customer) {
            coffeeCreator.createCoffee(CoffeeType.AMERICANNO);
        System.out.println("Customer order " + CoffeeType.AMERICANNO);

    }


}
