package base;


import coffe_makers.Barista;
import coffe_makers.CoffeeMachine;
import factory.coffee_factory.CoffeeCreator;
import factory.coffee_factory.CoffeeType;

public class StarBucksCoffee {

    CoffeeCreator coffeeCreator = new CoffeeCreator();
    Barista barista = new Barista();
    CoffeeMachine coffeeMachine = new CoffeeMachine();

    public void serveCustomer(Customer customer) {
            if (coffeeMachine.isWork() == true){
                coffeeMachine.makeCoffee(coffeeCreator);
        System.out.println("Customer order " + customer.orderCoffee() + " using coffee machine");
            } else barista.makeCoffee(coffeeCreator);
        System.out.println("Customer order " + customer.orderCoffee() + " asking Baristas");

    }


}
