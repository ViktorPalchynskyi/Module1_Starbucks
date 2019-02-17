package coffe_makers;

import coffee_type.BaseCoffee;
import factory.coffee_factory.*;

public class Barista implements MakeCoffeeInterface{
    AmericannoCreator americannoCreator = new AmericannoCreator();
    EspressoCreator espressoCreator = new EspressoCreator();
    LatteCreator latteCreator = new LatteCreator();


    @Override
    public BaseCoffee makeCoffee(CoffeeType coffeeType) {
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
