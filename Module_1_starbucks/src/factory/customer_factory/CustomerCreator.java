package factory.customer_factory;

import base.Customer;
import factory.customer_factory.CustomerFactoryInterface;

public class CustomerCreator implements CustomerFactoryInterface {
    @Override
    public static Customer createCustomer() {
        return new Customer();
    }
}
