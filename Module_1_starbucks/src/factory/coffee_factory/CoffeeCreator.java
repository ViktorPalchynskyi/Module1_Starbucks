package factory.coffee_factory;

import coffee_type.BaseCoffee;

public class CoffeeCreator {
    AmericannoCreator americannoCreator = new AmericannoCreator();
    EspressoCreator espressoCreator = new EspressoCreator();
    LatteCreator latteCreator = new LatteCreator();


    public  BaseCoffee createCoffee(CoffeeType coffeeType){
        switch (coffeeType) {
            case AMERICANNO:
                return americannoCreator.createAmericanno();
            case ESPRESSO:
                return espressoCreator.createEspresso();
            case LATTE:
                return latteCreator.createLatte();
        }
        return null;
    }
}
