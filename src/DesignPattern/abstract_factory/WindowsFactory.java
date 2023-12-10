package DesignPattern.abstract_factory;

public class WindowsFactory implements ComponentAbstractFactory {

    private static WindowsFactory instance = new WindowsFactory();

    public WindowsFactory() {}

    public static WindowsFactory getInstance() {
        return instance;
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public TextEdit createTextEdit() {
        return new WindowsTextEdit();
    }
}
