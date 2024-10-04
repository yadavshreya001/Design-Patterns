package decorator_Design_Pattern.addons;

import decorator_Design_Pattern.Beverage;

public class Mocha implements Beverage {

    Beverage cb;
    public Mocha(Beverage b){
        this.cb = b;
    }
    @Override
    public int getCost() {
        return 20 + cb.getCost();
    }

}
