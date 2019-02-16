package factory.coffee_factory;

import coffee_type.Espresso;

public class EspressoCreator implements EspressoFactoryInterface{
    @Override
    public Espresso createEspresso() {
        return new Espresso();
    }
}
