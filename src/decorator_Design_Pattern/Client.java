package decorator_Design_Pattern;

import decorator_Design_Pattern.addons.Milk;
import decorator_Design_Pattern.addons.Whip;

public class Client {
    public static void main(String[] args) {

        Beverage b = new Espresso();
        b.getCost();

        // Espresso with WHip and Milk
        Beverage cb = new Espresso();
        cb = new Whip(cb);
        cb = new Milk(cb);
        System.out.println(cb.getCost());

    }
}
