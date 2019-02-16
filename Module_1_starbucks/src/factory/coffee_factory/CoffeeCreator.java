package factory.coffee_factory;

import coffee_type.Coffee;

public class CoffeeCreator {
    AmericannoCreator americannoCreator;
    EspressoCreator espressoCreator;
    LatteCreator latteCreator;


    Coffee createCoffe (CoffeeType coffeeType){
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
