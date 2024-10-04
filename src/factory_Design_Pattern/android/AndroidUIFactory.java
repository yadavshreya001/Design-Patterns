package factory_Design_Pattern.android;

import factory_Design_Pattern.Menu;
import factory_Design_Pattern.Button;
import factory_Design_Pattern.UIFactory;


public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
