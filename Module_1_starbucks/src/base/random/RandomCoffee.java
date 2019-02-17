package base.random;

import factory.coffee_factory.CoffeeType;

import java.util.Random;

public class RandomCoffee {

    CoffeeType [] coffeeTypes = new CoffeeType[]{CoffeeType.AMERICANNO, CoffeeType.LATTE, CoffeeType.ESPRESSO};


    public CoffeeType getRandomCoffee (){
        Random random = new Random();
        int rnd = random.nextInt(coffeeTypes.length);

        return coffeeTypes[rnd];

    }




}
