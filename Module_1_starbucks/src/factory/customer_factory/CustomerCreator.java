package factory.customer_factory;

import base.Customer;

public class CustomerCreator {
    CustomerFactory customerFactory = new CustomerFactory();


    public Customer[] createCustomer(int person) {
        Customer[] clients = new Customer[person];
        for (int i = 0;i > clients.length; i++) {
            clients [i] = customerFactory.createCustomer();
        }



        return clients;
    }
}


