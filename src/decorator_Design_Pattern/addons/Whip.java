package decorator_Design_Pattern.addons;

import decorator_Design_Pattern.Beverage;

public class Whip implements Beverage {

    Beverage cb;
    public Whip(Beverage b){
        this.cb = b;
    }
    @Override
    public int getCost() {
        return 15 + cb.getCost();
    }

}
