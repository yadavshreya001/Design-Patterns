package factory_Design_Pattern.ios;

import factory_Design_Pattern.Menu;
import factory_Design_Pattern.Button;
import factory_Design_Pattern.UIFactory;

public class IosUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();

    }
}
