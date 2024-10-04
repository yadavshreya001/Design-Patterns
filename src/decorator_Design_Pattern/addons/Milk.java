package decorator_Design_Pattern.addons;

import decorator_Design_Pattern.Beverage;

public class Milk implements Beverage {

    Beverage cb;
    public Milk(Beverage b){
        this.cb = b;
    }
    @Override
    public int getCost() {
        return 10 + cb.getCost();
    }

}
