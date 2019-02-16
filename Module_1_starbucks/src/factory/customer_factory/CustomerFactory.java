package factory.customer_factory;

import base.Customer;
import factory.coffee_factory.CoffeeType;

public class CustomerFactory {

    public static Customer createCustomer() {
        return new Customer(CoffeeType.AMERICANNO);
    }
}
