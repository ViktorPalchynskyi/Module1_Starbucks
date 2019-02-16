package factory.coffee_factory;

import coffee_type.Americanno;

public class AmericannoCreator implements AmericannoFactoryInterface {
    @Override
    public Americanno createAmericanno() {
        return new Americanno(2,2,1,1);
    }
}
