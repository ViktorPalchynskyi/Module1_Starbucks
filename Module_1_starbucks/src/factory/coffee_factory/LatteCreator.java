package factory.coffee_factory;

import coffee_type.Latte;

public class LatteCreator implements LatteFactoyrInterface {
    @Override
    public Latte createLatte() {
        return new Latte();
    }
}
