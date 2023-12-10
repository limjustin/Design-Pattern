package DesignPattern.abstract_factory;

public class Client {
    public static void main(String[] args) {
        ComponentAbstractFactory factory;

        // Windows Button
        factory = WindowsFactory.getInstance();
        System.out.println(factory);
        Button windowsButton = factory.createButton();
        windowsButton.render();

        // Mac Button
        factory = MacFactory.getInstance();
        System.out.println(factory);
        Button macButton = factory.createButton();
        macButton.render();

        // Windows CheckBox
        factory = WindowsFactory.getInstance();
        System.out.println(factory);  // Check WindowsFactory instance is same
        CheckBox windowsCheckBox = factory.createCheckBox();
        windowsCheckBox.render();
    }
}
