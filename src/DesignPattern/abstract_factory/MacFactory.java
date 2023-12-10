package DesignPattern.abstract_factory;

public class MacFactory implements ComponentAbstractFactory {

    private static MacFactory instance = new MacFactory();

    public MacFactory() {}

    public static MacFactory getInstance() {
        return instance;
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public TextEdit createTextEdit() {
        return new MacTextEdit();
    }
}
