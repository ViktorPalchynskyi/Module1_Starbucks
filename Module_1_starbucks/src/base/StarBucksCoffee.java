package base;


import coffe_makers.Barista;
import coffe_makers.CoffeeMachine;
import factory.customer_factory.CustomerCreator;

public class StarBucksCoffee {

    CoffeeCreator coffeeCreator = new CoffeeCreator();
    Barista barista = new Barista();
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    CustomerCreator customerCreator = new CustomerCreator();


    public void serveCustomer() {
        Customer [] customers = customerCreator.createCustomer(10);
        try {
            for (int i = 0; i < customers.length; i++) {
                if (coffeeMachine.isWork() == false){
                    coffeeMachine.makeCoffee(customers[i].orderCoffee());
                    System.out.println("Customer order " + coffeeMachine.makeCoffee(customers[i].orderCoffee()) + " using coffee machine");
                } else barista.makeCoffee(customers[i].orderCoffee());
                System.out.println("Customer order " + customers[i].orderCoffee() + " asking Baristas");
            }

        } catch (NullPointerException e){
            System.out.println("Customer has not existed yet");
            e.printStackTrace();
        }


    }


}
