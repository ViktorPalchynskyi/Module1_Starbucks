package factory.customer_factory;

import base.Customer;

public class CustomerCreator {
    CustomerFactory customerFactory = new CustomerFactory();


    public Customer[] createCustomer(int person) {
        Customer[] clients = new Customer[person];

        clients [] = customerFactory.createCustomer();


        return clients;
    }
}


